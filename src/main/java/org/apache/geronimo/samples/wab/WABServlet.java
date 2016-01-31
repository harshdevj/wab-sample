package org.apache.geronimo.samples.wab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.BundleContext;

public class WABServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext sc;
	private BundleContext bundleContext;

	public void init(ServletConfig config) throws ServletException {
		this.sc = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		performTask(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		performTask(request, response);
	}

	protected void performTask(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			this.bundleContext = ((BundleContext) this.sc.getAttribute("osgi-bundlecontext"));
			pw.println("Current wab id: " + this.bundleContext.getBundle().getBundleId() + "\n" + "wab symbolic name : "
					+ this.bundleContext.getBundle().getSymbolicName() + "\n" + "wab version :"
					+ this.bundleContext.getBundle().getVersion() + "\n");
		} catch (IOException io) {
		}
	}
}
