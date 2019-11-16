package yzw.control;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import yzw.service.CEUserService;
import yzw.service.impl.CEUserServiceImpl;
import yzw.user.CE_USER;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class addUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //可上传文件类型
        List<String> suffixList = new ArrayList<String>();
        suffixList.add(".jpg");
        suffixList.add(".png");
        suffixList.add(".gif");

        String username = null;
        String password = null;
        String gender = null;
        String birthday = null;
        String address = null;
        String sal = null;
        String pic = null;
        //创建接收文件的工厂类
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建文件解析对象
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        fileUpload.setFileSizeMax(1024*1024);
        try {
            //解析request并且获得文件中的每一项
            List<FileItem> fileList = fileUpload.parseRequest(req);
            for (FileItem file:fileList){
                //获得表单文本域名字
                String fileName = file.getFieldName();
                //获得文件的原始名字
                String origFileName = file.getName();
                //获得文本类型
                boolean isComm = file.isFormField();
                //获得文本内容
                String content = file.getString();
                //处理中文乱码
                content = new String(content.getBytes("ISO-8859-1"),"UTF-8");
                if (isComm && fileName != null && !"".equals(fileName)){
                    if (fileName.equals("username") ){
                        username=content;
                    }else if(fileName.equals("password")){
                        password=content;
                    }else if(fileName.equals("gender")){
                        gender=content;
                    }else if(fileName.equals("birthday")){
                        birthday=content;
                    }else if(fileName.equals("address")){
                        address=content;
                    }else if(fileName.equals("sal")){
                        sal=content;
                    }
                }

                if (!isComm && fileName !=null && !"".equals(fileName)){
                    //获得要保存的目标目录
                    String realPath = req.getSession().getServletContext().getRealPath("/upload/");
                    if(origFileName != null && !"".equals(origFileName)){
                        String suffix = origFileName.substring(origFileName.lastIndexOf("."));
                        if (suffixList.contains(suffix)){
                            //通过UUID随机生成文件名
                            String fileUUIDName = UUID.randomUUID().toString();
                            String relativePath = "/upload/"+fileUUIDName+suffix;
                            pic = relativePath;
                            //创建文件对象
                            File fi = new File(realPath,fileUUIDName+suffix);
                            //把文件写入目录
                            file.write(fi);
                        }else {
                            resp.getWriter().print("图片格式不正确");
                            return;
                        }
                    }
                }
            }
            //把获得的数据转化为数据库对应类型
            Integer genderInt = null;
            Date birthdayDate=null;
            BigDecimal salBD = null;
            if(gender != null){
                genderInt= new Integer(gender);
            }
            if (birthday != null){
                try {
                    birthdayDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            if (sal !=null ){
                salBD = new BigDecimal(sal);
            }
//封装user
            CE_USER user = new CE_USER();
            user.setUsername(username);
            user.setPassword(password);
            user.setGender(genderInt);
            user.setBirthday(birthdayDate);
            user.setAddress(address);
            user.setSal(salBD);
            user.setPic(pic);

            CEUserService ceUserService = new CEUserServiceImpl();
            ceUserService.addUser(user);
            //重定向页面
            req.getRequestDispatcher("/queryUserServlet").forward(req,resp);

        } catch (Exception e) {
            if (e instanceof FileUploadBase.FileSizeLimitExceededException){
                resp.getWriter().print("文件过大");
            }
            e.printStackTrace();
        }


        

       
    }
}
