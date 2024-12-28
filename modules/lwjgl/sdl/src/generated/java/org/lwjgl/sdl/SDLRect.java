/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.sdl.SDLStdinc.*;

public class SDLRect {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            HasRectIntersection             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasRectIntersection"),
            GetRectIntersection             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectIntersection"),
            GetRectUnion                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectUnion"),
            GetRectEnclosingPoints          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectEnclosingPoints"),
            GetRectAndLineIntersection      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectAndLineIntersection"),
            HasRectIntersectionFloat        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasRectIntersectionFloat"),
            GetRectIntersectionFloat        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectIntersectionFloat"),
            GetRectUnionFloat               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectUnionFloat"),
            GetRectEnclosingPointsFloat     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectEnclosingPointsFloat"),
            GetRectAndLineIntersectionFloat = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectAndLineIntersectionFloat");

    }

    protected SDLRect() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_HasRectIntersection ] ---

    /** {@code bool SDL_HasRectIntersection(SDL_Rect const * A, SDL_Rect const * B)} */
    public static boolean nSDL_HasRectIntersection(long A, long B) {
        long __functionAddress = Functions.HasRectIntersection;
        return invokePPZ(A, B, __functionAddress);
    }

    /** {@code bool SDL_HasRectIntersection(SDL_Rect const * A, SDL_Rect const * B)} */
    @NativeType("bool")
    public static boolean SDL_HasRectIntersection(@NativeType("SDL_Rect const *") SDL_Rect A, @NativeType("SDL_Rect const *") SDL_Rect B) {
        return nSDL_HasRectIntersection(A.address(), B.address());
    }

    // --- [ SDL_GetRectIntersection ] ---

    /** {@code bool SDL_GetRectIntersection(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    public static boolean nSDL_GetRectIntersection(long A, long B, long result) {
        long __functionAddress = Functions.GetRectIntersection;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectIntersection(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectIntersection(@NativeType("SDL_Rect const *") SDL_Rect A, @NativeType("SDL_Rect const *") SDL_Rect B, @NativeType("SDL_Rect *") SDL_Rect result) {
        return nSDL_GetRectIntersection(A.address(), B.address(), result.address());
    }

    // --- [ SDL_GetRectUnion ] ---

    /** {@code bool SDL_GetRectUnion(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    public static boolean nSDL_GetRectUnion(long A, long B, long result) {
        long __functionAddress = Functions.GetRectUnion;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectUnion(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectUnion(@NativeType("SDL_Rect const *") SDL_Rect A, @NativeType("SDL_Rect const *") SDL_Rect B, @NativeType("SDL_Rect *") SDL_Rect result) {
        return nSDL_GetRectUnion(A.address(), B.address(), result.address());
    }

    // --- [ SDL_GetRectEnclosingPoints ] ---

    /** {@code bool SDL_GetRectEnclosingPoints(SDL_Point const * points, int count, SDL_Rect const * clip, SDL_Rect * result)} */
    public static boolean nSDL_GetRectEnclosingPoints(long points, int count, long clip, long result) {
        long __functionAddress = Functions.GetRectEnclosingPoints;
        return invokePPPZ(points, count, clip, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectEnclosingPoints(SDL_Point const * points, int count, SDL_Rect const * clip, SDL_Rect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectEnclosingPoints(@NativeType("SDL_Point const *") SDL_Point.Buffer points, @NativeType("SDL_Rect const *") @Nullable SDL_Rect clip, @NativeType("SDL_Rect *") @Nullable SDL_Rect result) {
        return nSDL_GetRectEnclosingPoints(points.address(), points.remaining(), memAddressSafe(clip), memAddressSafe(result));
    }

    // --- [ SDL_GetRectAndLineIntersection ] ---

    /** {@code bool SDL_GetRectAndLineIntersection(SDL_Rect const * rect, int * X1, int * Y1, int * X2, int * Y2)} */
    public static boolean nSDL_GetRectAndLineIntersection(long rect, long X1, long Y1, long X2, long Y2) {
        long __functionAddress = Functions.GetRectAndLineIntersection;
        return invokePPPPPZ(rect, X1, Y1, X2, Y2, __functionAddress);
    }

    /** {@code bool SDL_GetRectAndLineIntersection(SDL_Rect const * rect, int * X1, int * Y1, int * X2, int * Y2)} */
    @NativeType("bool")
    public static boolean SDL_GetRectAndLineIntersection(@NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("int *") IntBuffer X1, @NativeType("int *") IntBuffer Y1, @NativeType("int *") IntBuffer X2, @NativeType("int *") IntBuffer Y2) {
        if (CHECKS) {
            check(X1, 1);
            check(Y1, 1);
            check(X2, 1);
            check(Y2, 1);
        }
        return nSDL_GetRectAndLineIntersection(rect.address(), memAddress(X1), memAddress(Y1), memAddress(X2), memAddress(Y2));
    }

    // --- [ SDL_HasRectIntersectionFloat ] ---

    /** {@code bool SDL_HasRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B)} */
    public static boolean nSDL_HasRectIntersectionFloat(long A, long B) {
        long __functionAddress = Functions.HasRectIntersectionFloat;
        return invokePPZ(A, B, __functionAddress);
    }

    /** {@code bool SDL_HasRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B)} */
    @NativeType("bool")
    public static boolean SDL_HasRectIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect A, @NativeType("SDL_FRect const *") SDL_FRect B) {
        return nSDL_HasRectIntersectionFloat(A.address(), B.address());
    }

    // --- [ SDL_GetRectIntersectionFloat ] ---

    /** {@code bool SDL_GetRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    public static boolean nSDL_GetRectIntersectionFloat(long A, long B, long result) {
        long __functionAddress = Functions.GetRectIntersectionFloat;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect A, @NativeType("SDL_FRect const *") SDL_FRect B, @NativeType("SDL_FRect *") SDL_FRect result) {
        return nSDL_GetRectIntersectionFloat(A.address(), B.address(), result.address());
    }

    // --- [ SDL_GetRectUnionFloat ] ---

    /** {@code bool SDL_GetRectUnionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    public static boolean nSDL_GetRectUnionFloat(long A, long B, long result) {
        long __functionAddress = Functions.GetRectUnionFloat;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectUnionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectUnionFloat(@NativeType("SDL_FRect const *") SDL_FRect A, @NativeType("SDL_FRect const *") SDL_FRect B, @NativeType("SDL_FRect *") SDL_FRect result) {
        return nSDL_GetRectUnionFloat(A.address(), B.address(), result.address());
    }

    // --- [ SDL_GetRectEnclosingPointsFloat ] ---

    /** {@code bool SDL_GetRectEnclosingPointsFloat(SDL_FPoint const * points, int count, SDL_FRect const * clip, SDL_FRect * result)} */
    public static boolean nSDL_GetRectEnclosingPointsFloat(long points, int count, long clip, long result) {
        long __functionAddress = Functions.GetRectEnclosingPointsFloat;
        return invokePPPZ(points, count, clip, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectEnclosingPointsFloat(SDL_FPoint const * points, int count, SDL_FRect const * clip, SDL_FRect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectEnclosingPointsFloat(@NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points, @NativeType("SDL_FRect const *") @Nullable SDL_FRect clip, @NativeType("SDL_FRect *") @Nullable SDL_FRect result) {
        return nSDL_GetRectEnclosingPointsFloat(points.address(), points.remaining(), memAddressSafe(clip), memAddressSafe(result));
    }

    // --- [ SDL_GetRectAndLineIntersectionFloat ] ---

    /** {@code bool SDL_GetRectAndLineIntersectionFloat(SDL_FRect const * rect, float * X1, float * Y1, float * X2, float * Y2)} */
    public static boolean nSDL_GetRectAndLineIntersectionFloat(long rect, long X1, long Y1, long X2, long Y2) {
        long __functionAddress = Functions.GetRectAndLineIntersectionFloat;
        return invokePPPPPZ(rect, X1, Y1, X2, Y2, __functionAddress);
    }

    /** {@code bool SDL_GetRectAndLineIntersectionFloat(SDL_FRect const * rect, float * X1, float * Y1, float * X2, float * Y2)} */
    @NativeType("bool")
    public static boolean SDL_GetRectAndLineIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect rect, @NativeType("float *") FloatBuffer X1, @NativeType("float *") FloatBuffer Y1, @NativeType("float *") FloatBuffer X2, @NativeType("float *") FloatBuffer Y2) {
        if (CHECKS) {
            check(X1, 1);
            check(Y1, 1);
            check(X2, 1);
            check(Y2, 1);
        }
        return nSDL_GetRectAndLineIntersectionFloat(rect.address(), memAddress(X1), memAddress(Y1), memAddress(X2), memAddress(Y2));
    }

    /** {@code void SDL_RectToFRect(SDL_Rect const * rect, SDL_FRect * frect)} */
    public static void SDL_RectToFRect(SDL_Rect rectInput, SDL_FRect frectOutput) {
        frectOutput
            .x(rectInput.x())
            .y(rectInput.y())
            .w(rectInput.w())
            .h(rectInput.h());
    }

    /** {@code bool SDL_PointInRect(SDL_Point const * p, SDL_Rect const *  r)} */
    public static boolean SDL_PointInRect(@Nullable SDL_Point p, @Nullable SDL_Rect r) {
        return p != null && r != null &&
            r.x() <= p.x() && p.x() < r.x() + r.w() &&
            r.y() <= p.y() && p.y() < r.y() + r.h();
    }

    /** {@code bool SDL_RectEmpty(SDL_Rect const * r)} */
    public static boolean SDL_RectEmpty(@Nullable SDL_Rect r) {
        return r == null || r.w() <= 0 || r.h() <= 0;
    }

    /** {@code bool SDL_RectsEqual(SDL_Rect const * a, SDL_Rect const * b)} */
    public static boolean SDL_RectsEqual(@Nullable SDL_Rect a, @Nullable SDL_Rect b) {
        return a != null && b != null &&
               a.x() == b.x() &&
               a.y() == b.y() &&
               a.w() == b.w() &&
               a.h() == b.h();
    }

    /** {@code bool SDL_PointInRectFloat(SDL_FPoint const * p, SDL_FRect const * r)} */
    public static boolean SDL_PointInRectFloat(@Nullable SDL_FPoint p, @Nullable SDL_FRect r) {
        return p != null && r != null &&
               r.x() <= p.x() && p.x() <= r.x() + r.w() &&
               r.y() <= p.y() && p.y() <= r.y() + r.h();
    }

    /** {@code bool SDL_RectEmptyFloat(SDL_FRect const * r)} */
    public static boolean SDL_RectEmptyFloat(@Nullable SDL_Rect r) {
        return r == null || r.w() <= 0.0f || r.h() <= 0.0f;
    }

    /** {@code bool SDL_RectsEqualEpsilon(DL_FRect const * a, SDL_FRect const * b, float epsilon)} */
    public static boolean SDL_RectsEqualEpsilon(@Nullable SDL_FRect a, @Nullable SDL_FRect b, float epsilon) {
        return a != null && b != null && (
            a == b ||
            (
                Math.abs(a.x() - b.x()) <= epsilon &&
                Math.abs(a.y() - b.y()) <= epsilon &&
                Math.abs(a.w() - b.w()) <= epsilon &&
                Math.abs(a.h() - b.h()) <= epsilon
            )
        );
    }

    /** {@code bool SDL_RectsEqualFloat(SDL_FRect const * a, SDL_FRect const * b)} */
    public static boolean SDL_RectsEqualFloat(@Nullable SDL_FRect a, @Nullable SDL_FRect b) {
        return SDL_RectsEqualEpsilon(a, b, SDL_FLT_EPSILON);
    }

}