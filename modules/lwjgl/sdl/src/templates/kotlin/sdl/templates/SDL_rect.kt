/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_rect() = SDL.apply {
    // SDL_FORCE_INLINE methods do not generate native code, so we port them manually
    customMethod("""
    /** {@code SDL_FORCE_INLINE void SDL_RectToFRect(const SDL_Rect *rect, SDL_FRect *frect)} */
    public static void SDL_RectToFRect(SDL_Rect rectInput, SDL_FRect frectOutput) {
        frectOutput.set(
            (float) rectInput.x(),
            (float) rectInput.y(),
            (float) rectInput.w(),
            (float) rectInput.h()
        );
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_PointInRect(const SDL_Point *p, const SDL_Rect *r)} */
    public static boolean SDL_PointInRect(@Nullable SDL_Point p, @Nullable SDL_Rect r) {
        return ((p != null) && (r != null) && (p.x() >= r.x()) && (p.x() < (r.x() + r.w())) &&
             (p.y() >= r.y()) && (p.y() < (r.y() + r.h())) );
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectEmpty(const SDL_Rect *r)} */
    public static boolean SDL_RectEmpty(@Nullable SDL_Rect r) {
        return ((r == null) || (r.w() <= 0) || (r.h() <= 0));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectsEqual(const SDL_Rect *a, const SDL_Rect *b)} */
    public static boolean SDL_RectsEqual(@Nullable SDL_Rect a, @Nullable SDL_Rect b) {
        return ((a != null) && (b != null) && (a.x() == b.x()) && (a.y() == b.y()) &&
            (a.w() == b.w()) && (a.h() == b.h()));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_PointInRectFloat(const SDL_FPoint *p, const SDL_FRect *r)} */
    public static boolean SDL_PointInRectFloat(@Nullable SDL_FPoint p, @Nullable SDL_FRect r) {
        return ((p != null) && (r != null) && (p.x() >= r.x()) && (p.x() <= (r.x() + r.w())) &&
             (p.y() >= r.y()) && (p.y() <= (r.y() + r.h())) );
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectEmptyFloat(const SDL_FRect *r)} */
    public static boolean SDL_RectEmptyFloat(@Nullable SDL_Rect r) {
        return ((r == null) || (r.w() <= 0.0f) || (r.h() <= 0.0f));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectsEqualEpsilon(const SDL_FRect *a, const SDL_FRect *b, const float epsilon)} */
    public static boolean SDL_RectsEqualEpsilon(@Nullable SDL_FRect a, @Nullable SDL_FRect b, float epsilon) {
        return ((a != null) && (b != null) && ((a == b) ||
            ((Math.abs(a.x() - b.x()) <= epsilon) &&
            (Math.abs(a.y() - b.y()) <= epsilon) &&
            (Math.abs(a.w() - b.w()) <= epsilon) &&
            (Math.abs(a.h() - b.h()) <= epsilon))));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectsEqualFloat(const SDL_FRect *a, const SDL_FRect *b)} */
    public static boolean SDL_RectsEqualFloat(@Nullable SDL_FRect a, @Nullable SDL_FRect b) {
        return SDL_RectsEqualEpsilon(a, b, SDL_FLT_EPSILON);
    }""")

    bool(
        "HasRectIntersection",

        nullable..Check(1)..SDL_Rect.const.p("A"),
        nullable..Check(1)..SDL_Rect.const.p("B")
    )

    bool(
        "GetRectIntersection",

        nullable..Check(1)..SDL_Rect.const.p("A"),
        nullable..Check(1)..SDL_Rect.const.p("B"),
        nullable..Check(1)..SDL_Rect.p("result")
    )

    bool(
        "GetRectUnion",

        nullable..Check(1)..SDL_Rect.const.p("A"),
        nullable..Check(1)..SDL_Rect.const.p("B"),
        nullable..Check(1)..SDL_Rect.p("result")
    )

    bool(
        "GetRectEnclosingPoints",

        SDL_Point.const.p("points"),
        AutoSize("points")..int("count"),
        nullable..Check(1)..SDL_Rect.const.p("clip"),
        Check(1)..SDL_Rect.p("result")
    )

    bool(
        "GetRectAndLineIntersection",

        Check(1)..SDL_Rect.const.p("rect"),
        Check(1)..int.p("X1"),
        Check(1)..int.p("Y1"),
        Check(1)..int.p("X2"),
        Check(1)..int.p("Y2")
    )

    bool(
        "HasRectIntersectionFloat",

        nullable..Check(1)..SDL_FRect.const.p("A"),
        nullable..Check(1)..SDL_FRect.const.p("B")
    )

    bool(
        "GetRectIntersectionFloat",

        nullable..Check(1)..SDL_FRect.const.p("A"),
        nullable..Check(1)..SDL_FRect.const.p("B"),
        nullable..Check(1)..SDL_FRect.p("result")
    )

    bool(
        "GetRectUnionFloat",

        nullable..Check(1)..SDL_FRect.const.p("A"),
        nullable..Check(1)..SDL_FRect.const.p("B"),
        Check(1)..SDL_FRect.p("result")
    )

    bool(
        "GetRectEnclosingPointsFloat",

        SDL_FPoint.const.p("points"),
        AutoSize("points")..int("count"),
        nullable..Check(1)..SDL_FRect.const.p("clip"),
        Check(1)..SDL_FRect.p("result")
    )

    bool(
        "GetRectAndLineIntersectionFloat",

        Check(1)..SDL_FRect.const.p("rect"),
        Check(1)..float.p("X1"),
        Check(1)..float.p("Y1"),
        Check(1)..float.p("X2"),
        Check(1)..float.p("Y2")
    )

}
