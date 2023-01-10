package com.dang_hust.mvvm_cities.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

public final class City {
    @NotNull
    private final String name;
    private final int img;
    private final int population;

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getImg() {
        return this.img;
    }

    public final int getPopulation() {
        return this.population;
    }

    public City(@NotNull String name, int img, int population) {
        Intrinsics.checkNotNullParameter(name, "name");
        super();
        this.name = name;
        this.img = img;
        this.population = population;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.img;
    }

    public final int component3() {
        return this.population;
    }

    @NotNull
    public final City copy(@NotNull String name, int img, int population) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new City(name, img, population);
    }

    // $FF: synthetic method
    public static City copy$default(City var0, String var1, int var2, int var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.name;
        }

        if ((var4 & 2) != 0) {
            var2 = var0.img;
        }

        if ((var4 & 4) != 0) {
            var3 = var0.population;
        }

        return var0.copy(var1, var2, var3);
    }

    @NotNull
    public String toString() {
        return "City(name=" + this.name + ", img=" + this.img + ", population=" + this.population + ")";
    }

    public int hashCode() {
        String var10000 = this.name;
        return ((var10000 != null ? var10000.hashCode() : 0) * 31 + Integer.hashCode(this.img)) * 31 + Integer.hashCode(this.population);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof City) {
                City var2 = (City)var1;
                if (Intrinsics.areEqual(this.name, var2.name) && this.img == var2.img && this.population == var2.population) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
