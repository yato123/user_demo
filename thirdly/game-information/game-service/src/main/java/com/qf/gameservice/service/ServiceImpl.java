package com.qf.gameservice.service;

import com.qf.entity.GameInfoAndCategoryInfo;
import com.qf.gameapi.serviceapi.IServiceApi;

import java.util.List;

public class ServiceImpl implements IServiceApi {

    @Override
    public List<GameInfoAndCategoryInfo> findByGameAll() {
        return null;
    }

    @Override
    public GameInfoAndCategoryInfo findByGame(String gameName) {
        return null;
    }

    @Override
    public List<GameInfoAndCategoryInfo> categoryFindByGame(long gameId) {
        return null;
    }

    @Override
    public int addCategory(GameInfoAndCategoryInfo gameInfoAndCategoryInfo) {
        return 0;
    }

    @Override
    public int delCategory(long id) {
        return 0;
    }
}
