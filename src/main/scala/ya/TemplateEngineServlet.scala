package ya

import org.fusesource.scalate._
import org.fusesource.scalate.servlet._
import javax.servlet._
import javax.servlet.http._

class TemplateEngineServlet extends HttpServlet {
  override def service(req: HttpServletRequest, res: HttpServletResponse) {
    render(req.getServletPath, req, res)
  }

  def render(template: String, req: HttpServletRequest, res: HttpServletResponse) {
    val templateEngine = new TemplateEngine
    templateEngine.resourceLoader = new ServletResourceLoader(getServletContext)
    val context = new ServletRenderContext(templateEngine, req, res, getServletContext)
    context.include(template)
    res.setStatus(HttpServletResponse.SC_OK)
  }
}

