/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-08-30 00:41:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch09;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jstl_005ffmt04_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/it/Documents/jspwrokspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/JSPBook/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1692761752664L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005ftimeZone_0026_005fvalue;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005ftimeZone_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005ftimeZone_0026_005fvalue.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      java.util.Date now = null;
      now = (java.util.Date) _jspx_page_context.getAttribute("now", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (now == null){
        now = new java.util.Date();
        _jspx_page_context.setAttribute("now", now, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("	<p> 한국 : ");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	<p>	");
      if (_jspx_meth_fmt_005ftimeZone_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	<p> ");
      if (_jspx_meth_fmt_005ftimeZone_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /ch09/jstl_fmt04.jsp(12,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /ch09/jstl_fmt04.jsp(12,10) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setType("both");
      // /ch09/jstl_fmt04.jsp(12,10) name = dateStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setDateStyle("full");
      // /ch09/jstl_fmt04.jsp(12,10) name = timeStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setTimeStyle("full");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005ftimeZone_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:timeZone
    org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag _jspx_th_fmt_005ftimeZone_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag) _005fjspx_005ftagPool_005ffmt_005ftimeZone_0026_005fvalue.get(org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag.class);
    boolean _jspx_th_fmt_005ftimeZone_005f0_reused = false;
    try {
      _jspx_th_fmt_005ftimeZone_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005ftimeZone_005f0.setParent(null);
      // /ch09/jstl_fmt04.jsp(13,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005ftimeZone_005f0.setValue("America/New_York");
      int _jspx_eval_fmt_005ftimeZone_005f0 = _jspx_th_fmt_005ftimeZone_005f0.doStartTag();
      if (_jspx_eval_fmt_005ftimeZone_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_005ftimeZone_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005ftimeZone_005f0);
        }
        do {
          out.write(" \r\n");
          out.write("		뉴욕 : ");
          if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_fmt_005ftimeZone_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_fmt_005ftimeZone_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_005ftimeZone_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_fmt_005ftimeZone_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005ftimeZone_0026_005fvalue.reuse(_jspx_th_fmt_005ftimeZone_005f0);
      _jspx_th_fmt_005ftimeZone_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005ftimeZone_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005ftimeZone_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005ftimeZone_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f1_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005ftimeZone_005f0);
      // /ch09/jstl_fmt04.jsp(14,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /ch09/jstl_fmt04.jsp(14,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setType("both");
      // /ch09/jstl_fmt04.jsp(14,7) name = dateStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setDateStyle("full");
      // /ch09/jstl_fmt04.jsp(14,7) name = timeStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setTimeStyle("full");
      int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      _jspx_th_fmt_005fformatDate_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005ftimeZone_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:timeZone
    org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag _jspx_th_fmt_005ftimeZone_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag) _005fjspx_005ftagPool_005ffmt_005ftimeZone_0026_005fvalue.get(org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag.class);
    boolean _jspx_th_fmt_005ftimeZone_005f1_reused = false;
    try {
      _jspx_th_fmt_005ftimeZone_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005ftimeZone_005f1.setParent(null);
      // /ch09/jstl_fmt04.jsp(16,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005ftimeZone_005f1.setValue("Europe/London");
      int _jspx_eval_fmt_005ftimeZone_005f1 = _jspx_th_fmt_005ftimeZone_005f1.doStartTag();
      if (_jspx_eval_fmt_005ftimeZone_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_005ftimeZone_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005ftimeZone_005f1);
        }
        do {
          out.write(" \r\n");
          out.write("		런던 : ");
          if (_jspx_meth_fmt_005fformatDate_005f2(_jspx_th_fmt_005ftimeZone_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_fmt_005ftimeZone_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_005ftimeZone_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_fmt_005ftimeZone_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005ftimeZone_0026_005fvalue.reuse(_jspx_th_fmt_005ftimeZone_005f1);
      _jspx_th_fmt_005ftimeZone_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005ftimeZone_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005ftimeZone_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005ftimeZone_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f2_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005ftimeZone_005f1);
      // /ch09/jstl_fmt04.jsp(17,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /ch09/jstl_fmt04.jsp(17,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f2.setType("both");
      // /ch09/jstl_fmt04.jsp(17,7) name = dateStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f2.setDateStyle("full");
      // /ch09/jstl_fmt04.jsp(17,7) name = timeStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f2.setTimeStyle("full");
      int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
      _jspx_th_fmt_005fformatDate_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f2, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f2_reused);
    }
    return false;
  }
}
