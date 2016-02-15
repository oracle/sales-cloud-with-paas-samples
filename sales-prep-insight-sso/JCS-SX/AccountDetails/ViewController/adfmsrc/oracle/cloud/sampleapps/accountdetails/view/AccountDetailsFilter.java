package oracle.cloud.sampleapps.accountdetails.view;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.adf.share.logging.ADFLogger;


public class AccountDetailsFilter implements Filter {
    
    private static ADFLogger LOG = ADFLogger.createADFLogger(AccountDetailsFilter.class.toString());
    
    private static final String ENCODED_AMP = "&amp;";
    private static final String PLAIN_AMP = "&";
    
    public AccountDetailsFilter() {
        super();
    }

    public void destroy() {
    }

    public void init(FilterConfig filterConfig) {
    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException,
                                                         ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        
        final String queryString = request.getQueryString();
        LOG.fine("[AccountDetailsFilter] Original URL: "+request.getRequestURI() +"?" + queryString);
        
        //A query String should never contain an ampersand encoded as "&amp;", the
        // proper URL encoding would be "%26" if one wanted to include "&" as part
        // of parameter value. So, we should be able to safely replace all occurrences
        // of "&amp;" with just "&".
        if(queryString != null && queryString.contains(ENCODED_AMP)){
            LOG.severe("[AccountDetailsFilter] URL Contains poorly encoded Ampersands: "+request.getRequestURI() +"?" + queryString);
            final String newUrl = request.getRequestURI() +"?" + queryString.replaceAll(ENCODED_AMP, PLAIN_AMP);
            response.sendRedirect(newUrl);
            LOG.severe("[AccountDetailsFilter] Redirecting to: "+newUrl);
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
