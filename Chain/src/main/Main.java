package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler handlerAutobuz=new AutobuzHandler();
        MijlocTransportHandler handlerMetrou=new MetrouHandler();
        MijlocTransportHandler handlerTramvai=new TramvaiHandler();
        MijlocTransportHandler handlerTroleibuz=new TroleibuzHandler();

        handlerTroleibuz.setUrmatorulMijlocTransportHandler(handlerAutobuz);
        handlerAutobuz.setUrmatorulMijlocTransportHandler(handlerTramvai);
        handlerTramvai.setUrmatorulMijlocTransportHandler(handlerMetrou);

        handlerTroleibuz.recomandaMijlocTransport(2);
        handlerTroleibuz.recomandaMijlocTransport(6);
        handlerTroleibuz.recomandaMijlocTransport(11);
    }
}
