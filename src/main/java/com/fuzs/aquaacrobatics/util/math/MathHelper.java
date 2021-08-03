package com.fuzs.aquaacrobatics.util.math;

public class MathHelper extends net.minecraft.util.math.MathHelper {
    
    MathHelper mathhelper = new MathHelper();

    public static float lerp(float pct, float start, float end) {
        return start + pct * (end - start);
    }

}
