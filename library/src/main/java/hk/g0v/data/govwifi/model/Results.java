package hk.g0v.data.govwifi.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by fung on 3/5/2017.
 */

public class Results {

    @SerializedName("results")
    private List<Result> results;

    @Override
    public String toString() {
        return "Results{" +
                "results=" + results +
                '}';
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
