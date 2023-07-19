package com.zs.twitch.model;

import com.zs.twitch.db.entity.ItemEntity;

public record FavoriteRequestBody(
        ItemEntity favorite
) {}

