module de.joergrathlev.greeter.serviceimpl {
    requires de.joergrathlev.greeter.api;

    provides de.joergrathlev.greeter.api.Greeter with de.joergrathlev.greeter.serviceimpl.GreeterService;
}
