package Services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 26 22:24:22 BDT 2021
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);
}
