package com.qf.gameapi.serviceapi;

import com.qf.entity.GameInfoAndCategoryInfo;

import java.util.List;

public interface IServiceApi {
    List<GameInfoAndCategoryInfo> findByGameAll();
    GameInfoAndCategoryInfo findByGame(String gameName);
    List<GameInfoAndCategoryInfo> categoryFindByGame(long gameId);
    int addCategory(GameInfoAndCategoryInfo gameInfoAndCategoryInfo);
    int delCategory(long id);
}
