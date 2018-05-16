package com.microsoft.bot.builder.core;

import com.microsoft.bot.builder.core.TurnContext;
import com.microsoft.bot.schema.models.Activity;
import com.microsoft.bot.schema.models.ResourceResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@FunctionalInterface
public interface SendActivitiesHandler {
    CompletableFuture<ResourceResponse[]> handle(TurnContext context, List<Activity> activities, Func<CompletableFuture<ResourceResponse[]>> next);
}
// public delegate CompletableFuture<ResourceResponse[]> SendActivitiesHandler(ITurnContext context, List<Activity> activities, Func<Task<ResourceResponse[]>> next);
