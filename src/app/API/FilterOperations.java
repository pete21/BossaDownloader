package app.API;

import app.API.JNAinterface.NolTickerAPI;

import java.util.Set;

public interface FilterOperations {
    //@Deprecated
    //String addToFilter(Set<String> isins) throws IllegalArgumentException;

    String addTickersToFilter(Set<NolTickerAPI> tickers);

    @SuppressWarnings("SameReturnValue")
    String removeTickersFromFilter(Set<NolTickerAPI> tickers) throws IllegalStateException;

    //clear filter before adding new papers
    @SuppressWarnings("UnusedReturnValue")
    String clearFilter();

    Set<NolTickerAPI> getTickersInFilter();
}
