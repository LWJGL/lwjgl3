/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Layout for generated vertex attributes.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct parsl_annotation {
 *     float {@link #u_along_curve};
 *     float {@link #v_across_curve};
 *     float {@link #spine_to_edge_x};
 *     float {@link #spine_to_edge_y};
 * }</code></pre>
 */
@NativeType("struct parsl_annotation")
public class ParSLAnnotation extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        U_ALONG_CURVE,
        V_ACROSS_CURVE,
        SPINE_TO_EDGE_X,
        SPINE_TO_EDGE_Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        U_ALONG_CURVE = layout.offsetof(0);
        V_ACROSS_CURVE = layout.offsetof(1);
        SPINE_TO_EDGE_X = layout.offsetof(2);
        SPINE_TO_EDGE_Y = layout.offsetof(3);
    }

    /**
     * Creates a {@code ParSLAnnotation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParSLAnnotation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** longitudinal coordinate (see {@link ParStreamlines#PAR_U_MODE_NORMALIZED_DISTANCE parsl_u_mode}) */
    public float u_along_curve() { return nu_along_curve(address()); }
    /** either + or - depending on the side */
    public float v_across_curve() { return nv_across_curve(address()); }
    /** normalized vector from spine to edge */
    public float spine_to_edge_x() { return nspine_to_edge_x(address()); }
    /** normalized vector from spine to edge */
    public float spine_to_edge_y() { return nspine_to_edge_y(address()); }

    // -----------------------------------

    /** Returns a new {@code ParSLAnnotation} instance for the specified memory address. */
    public static ParSLAnnotation create(long address) {
        return wrap(ParSLAnnotation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLAnnotation createSafe(long address) {
        return address == NULL ? null : wrap(ParSLAnnotation.class, address);
    }

    /**
     * Create a {@link ParSLAnnotation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParSLAnnotation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLAnnotation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #u_along_curve}. */
    public static float nu_along_curve(long struct) { return UNSAFE.getFloat(null, struct + ParSLAnnotation.U_ALONG_CURVE); }
    /** Unsafe version of {@link #v_across_curve}. */
    public static float nv_across_curve(long struct) { return UNSAFE.getFloat(null, struct + ParSLAnnotation.V_ACROSS_CURVE); }
    /** Unsafe version of {@link #spine_to_edge_x}. */
    public static float nspine_to_edge_x(long struct) { return UNSAFE.getFloat(null, struct + ParSLAnnotation.SPINE_TO_EDGE_X); }
    /** Unsafe version of {@link #spine_to_edge_y}. */
    public static float nspine_to_edge_y(long struct) { return UNSAFE.getFloat(null, struct + ParSLAnnotation.SPINE_TO_EDGE_Y); }

    // -----------------------------------

    /** An array of {@link ParSLAnnotation} structs. */
    public static class Buffer extends StructBuffer<ParSLAnnotation, Buffer> {

        private static final ParSLAnnotation ELEMENT_FACTORY = ParSLAnnotation.create(-1L);

        /**
         * Creates a new {@code ParSLAnnotation.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParSLAnnotation#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected ParSLAnnotation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ParSLAnnotation#u_along_curve} field. */
        public float u_along_curve() { return ParSLAnnotation.nu_along_curve(address()); }
        /** @return the value of the {@link ParSLAnnotation#v_across_curve} field. */
        public float v_across_curve() { return ParSLAnnotation.nv_across_curve(address()); }
        /** @return the value of the {@link ParSLAnnotation#spine_to_edge_x} field. */
        public float spine_to_edge_x() { return ParSLAnnotation.nspine_to_edge_x(address()); }
        /** @return the value of the {@link ParSLAnnotation#spine_to_edge_y} field. */
        public float spine_to_edge_y() { return ParSLAnnotation.nspine_to_edge_y(address()); }

    }

}