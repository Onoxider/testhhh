package httpNEW;

/**
 * Created by yokuras on 25.07.2017.
 */
import java.util.Map;

public interface HttpRequest {

    HttpMethod getMethod();

    String getPath();

    Map<String, String> getParams();

    default String getHostAndPort() {
        return getHeaders().get("Host");
    }

    Map<String, String> getHeaders();

    String getBody();

    static HttpRequest from(HttpMethod httpMethod, String path,
                            Map<String, String> params,
                            Map<String, String> headers,
                            String body) {

        return new HttpRequest() {
            @Override
            public HttpMethod getMethod() {
                return httpMethod;
            }

            @Override
            public String getPath() {
                return path;
            }

            @Override
            public Map<String, String> getParams() {
                return params;
            }

            @Override
            public Map<String, String> getHeaders() {
                return headers;
            }

            @Override
            public String getBody() {
                return body;
            }
        };
    }
}
