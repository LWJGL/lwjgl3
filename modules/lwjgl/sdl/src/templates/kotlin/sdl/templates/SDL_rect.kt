/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_rect = "SDLRect".nativeClassSDL("SDL_rect") {
    javaImport("static org.lwjgl.sdl.SDLStdinc.*")

    customMethod("""
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
    public static boolean SDL_RectEmptyFloat(@Nullable SDL_FRect r) {
        return r == null || r.w() < 0.0f || r.h() < 0.0f;
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
    }""")

    bool(
        "HasRectIntersection",

        SDL_Rect.const.p("A"),
        SDL_Rect.const.p("B")
    )

    bool(
        "GetRectIntersection",

        SDL_Rect.const.p("A"),
        SDL_Rect.const.p("B"),
        SDL_Rect.p("result")
    )

    bool(
        "GetRectUnion",

        SDL_Rect.const.p("A"),
        SDL_Rect.const.p("B"),
        SDL_Rect.p("result")
    )

    bool(
        "GetRectEnclosingPoints",

        SDL_Point.const.p("points"),
        AutoSize("points")..int("count"),
        nullable..SDL_Rect.const.p("clip"),
        nullable..SDL_Rect.p("result")
    )

    bool(
        "GetRectAndLineIntersection",

        SDL_Rect.const.p("rect"),
        Check(1)..int.p("X1"),
        Check(1)..int.p("Y1"),
        Check(1)..int.p("X2"),
        Check(1)..int.p("Y2")
    )

    bool(
        "HasRectIntersectionFloat",

        SDL_FRect.const.p("A"),
        SDL_FRect.const.p("B")
    )

    bool(
        "GetRectIntersectionFloat",

        SDL_FRect.const.p("A"),
        SDL_FRect.const.p("B"),
        SDL_FRect.p("result")
    )

    bool(
        "GetRectUnionFloat",

        SDL_FRect.const.p("A"),
        SDL_FRect.const.p("B"),
        SDL_FRect.p("result")
    )

    bool(
        "GetRectEnclosingPointsFloat",

        SDL_FPoint.const.p("points"),
        AutoSize("points")..int("count"),
        nullable..SDL_FRect.const.p("clip"),
        nullable..SDL_FRect.p("result")
    )

    bool(
        "GetRectAndLineIntersectionFloat",

        SDL_FRect.const.p("rect"),
        Check(1)..float.p("X1"),
        Check(1)..float.p("Y1"),
        Check(1)..float.p("X2"),
        Check(1)..float.p("Y2")
    )
}