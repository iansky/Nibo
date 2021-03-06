package com.alium.nibo.repo.directions;


import java.util.List;

/**
 * Created by Abdul-Mujib Aliu on 4/3/2016.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();

    void onDirectionFinderError(String errorMessage);

    void onDirectionFinderSuccess(List<Route> route);
}
