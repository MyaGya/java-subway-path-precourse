package subway.screen;

import java.util.Arrays;
import java.util.List;
import subway.functionList.Function;
import subway.functionList.MainFunction;
import subway.functionList.StationFunction;

public enum ControlScreen implements Screen {
    MAIN("메인 화면", Arrays.asList(MainFunction.values())),
    STATION_MANAGEMENT("역 관리 화면", Arrays.asList(StationFunction.values())),
    ;
    private String title;
    private List<Function> functions;

    ControlScreen(String title, List<Function> functions) {
        this.title = title;
        this.functions = functions;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<Function> getFunctions() {
        return functions;
    }
}
