<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/27
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        <!--
        body {
            margin-left: 0px;
            margin-top: 0px;
            margin-right: 0px;
            margin-bottom: 0px;
        }
        .STYLE1 {
            font-size: 12px;
            color: #FFFFFF;
        }
        .STYLE3 {
            font-size: 12px;
            color: #033d61;
        }
        -->
    </style>
    <style type="text/css">
        .menu_title SPAN {
            FONT-WEIGHT: bold; LEFT: 3px; COLOR: #ffffff; POSITION: relative; TOP: 2px
        }
        .menu_title2 SPAN {
            FONT-WEIGHT: bold; LEFT: 3px; COLOR: #FFCC00; POSITION: relative; TOP: 2px
        }

    </style>
</head>
<body>
<table width="165" height="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td height="28" background="../images/main_40.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="19%">&nbsp;</td>
                <td width="81%" height="20"><span class="STYLE1">管理菜单</span></td>
            </tr>
        </table></td>
    </tr>
    <tr>
        <td valign="top"><table width="151" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td height="23" background="../images/main_47.gif" id="imgmenu1" class="menu_title" onMouseOver="this.className='menu_title2';" onClick="showsubmenu(1)" onMouseOut="this.className='menu_title';" style="cursor:hand"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td width="18%">&nbsp;</td>
                                <td width="82%" class="STYLE1">业务中心</td>
                            </tr>
                        </table></td>
                    </tr>
                    <tr>
                        <td background="../images/main_51.gif" id="submenu1">
                            <div class="sec_menu" >
                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td><table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
                                            <tr>
                                                <td width="16%" height="25"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                                <td width="84%" height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">短信群发</span></td>
                                                    </tr>
                                                </table></td>
                                            </tr>
                                            <tr>
                                                <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                                <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">
                          	<a href="middel.jsp" style="text-decoration: none" target="mainFrame">用户资料修改</a>
                          	</span></td>
                                                    </tr>
                                                </table></td>
                                            </tr>
                                            <tr>
                                                <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                                <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">公司信息管理</span></td>
                                                    </tr>
                                                </table></td>
                                            </tr>
                                            <tr>
                                                <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                                <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">其他业务</span></td>
                                                    </tr>
                                                </table></td>
                                            </tr>
                                        </table></td>
                                    </tr>
                                    <tr>
                                        <td height="5"><img src="../images/main_52.gif" width="151" height="5" /></td>
                                    </tr>
                                </table></div></td>
                    </tr>

                </table></td>
            </tr>
            <tr>
                <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td height="23" background="../images/main_47.gif" id="imgmenu2" class="menu_title" onmouseover="this.className='menu_title2';" onclick="showsubmenu(2)" onmouseout="this.className='menu_title';" style="cursor:hand"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td width="18%">&nbsp;</td>
                                <td width="82%" class="STYLE1">系统管理</td>
                            </tr>
                        </table></td>
                    </tr>
                    <tr>
                        <td background="../images/main_51.gif" id="submenu2"><div class="sec_menu" >
                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td><table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
                                        <tr>
                                            <td width="16%" height="25"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td width="84%" height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">系统配置</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                        <tr>
                                            <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">修改用户密码</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                        <tr>
                                            <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">数据更新</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                        <tr>
                                            <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">网站维护</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                    </table></td>
                                </tr>
                                <tr>
                                    <td height="5"><img src="../images/main_52.gif" width="151" height="5" /></td>
                                </tr>
                            </table>
                        </div></td>
                    </tr>
                </table>          </td>
            </tr>
            <tr>
                <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td height="23" background="../images/main_47.gif" id="imgmenu3" class="menu_title" onmouseover="this.className='menu_title2';" onclick="showsubmenu(3)" onmouseout="this.className='menu_title';" style="cursor:hand"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td width="18%">&nbsp;</td>
                                <td width="82%" class="STYLE1">安全管理</td>
                            </tr>
                        </table></td>
                    </tr>
                    <tr>
                        <td background="../images/main_51.gif" id="submenu3" style="DISPLAY: none"><div class="sec_menu" >
                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td><table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
                                        <tr>
                                            <td width="16%" height="25"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td width="84%" height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">企业安全</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                        <tr>
                                            <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">信息安全管理</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                        <tr>
                                            <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">安全审计</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                        <tr>
                                            <td height="23"><div align="center"><img src="../images/left.gif" width="10" height="10" /></div></td>
                                            <td height="23"><table width="95%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td height="20" style="cursor:hand" onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "onmouseout="this.style.borderStyle='none'"><span class="STYLE3">网站安全</span></td>
                                                </tr>
                                            </table></td>
                                        </tr>
                                    </table></td>
                                </tr>
                                <tr>
                                    <td height="5"><img src="../images/main_52.gif" width="151" height="5" /></td>
                                </tr>
                            </table>
                        </div></td>
                    </tr>
                </table></td>
            </tr>
        </table></td>
    </tr>
    <tr>
        <td height="18" background="../images/main_58.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td height="18" valign="bottom"><div align="center" class="STYLE3">版本：2008V1.0</div></td>
            </tr>
        </table></td>
    </tr>
</table>
</body>
</html>
