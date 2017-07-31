package httpNEW;

import java.net.Socket;

public class HelloWorldServer extends SocketProcessor {

    public static final String HTML =
            "<html><head><meta charset=\"utf-8\"/></head><body><h1>Привет от Habrahabr`а!..</h1></body></html>";

    HelloWorldServer(Socket s) throws Throwable {
        super(s);
    }

    @Override
    protected String mapRequest(HttpRequest httpRequest) {
        return HTML;
    }
}