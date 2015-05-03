/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */

/**
 * http://stackoverflow.com/questions/4200224/random-noise-functions-for-glsl#answer-4275343
 */
float random(vec2 co, float time) {
    return fract(sin(dot(co, vec2(12.9898, 78.233)) * time) * 43758.5453) * 2.0 - 1.0;
}
