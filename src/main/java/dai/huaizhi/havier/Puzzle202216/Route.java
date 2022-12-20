package dai.huaizhi.havier.Puzzle202216;

import java.util.ArrayList;
import java.util.List;

import static dai.huaizhi.havier.Puzzle202216.Main.*;

public class Route {
    private final List<Valve> route = new ArrayList<>();





    public Route() {

    }

    public Route(List<Valve> beforeRoute) {
        route.addAll(beforeRoute);
    }

    public int getCurrentMinutes() {
        var totalMinutes = 0;
        for (var i = 0; i < route.size() - 1; i++) {
            totalMinutes += calculateMinutesBetweenValves(route.get(i), route.get(i + 1));
        }
        return totalMinutes;
    }

    public List<Valve> getRoute() {
        return route;
    }

    public void addAPoint(Valve valve) {
        route.add(valve);
    }

    public void removeAPointFromRoute(Valve valve) {
        if (!route.remove(valve)) {
            throw new RuntimeException("Remove Valve from route failed.");
        }
    }

    public String routesOrderString() {
        var a = "";
        for (var e : route) {
            a = a + e.getId();
        }
        return a;
    }
}
