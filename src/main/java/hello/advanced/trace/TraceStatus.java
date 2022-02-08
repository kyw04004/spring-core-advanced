package hello.advanced.trace;

public class TraceStatus {

    private TraceId traceId;
    private Long startTimems;
    private String message;

    public TraceStatus(TraceId traceId, Long startTimems, String message) {
        this.traceId = traceId;
        this.startTimems = startTimems;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimems;
    }

    public String getMessage() {
        return message;
    }
}
