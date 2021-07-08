/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Frame timing data provided by direct mode drivers.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct DriverDirectMode_FrameTiming {
 *     uint32_t {@link #m_nSize};
 *     uint32_t {@link #m_nNumFramePresents};
 *     uint32_t {@link #m_nNumMisPresented};
 *     uint32_t {@link #m_nNumDroppedFrames};
 *     uint32_t m_nReprojectionFlags;
 * }</code></pre>
 */
@NativeType("struct DriverDirectMode_FrameTiming")
public class DriverDirectModeFrameTiming extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NSIZE,
        M_NNUMFRAMEPRESENTS,
        M_NNUMMISPRESENTED,
        M_NNUMDROPPEDFRAMES,
        M_NREPROJECTIONFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NSIZE = layout.offsetof(0);
        M_NNUMFRAMEPRESENTS = layout.offsetof(1);
        M_NNUMMISPRESENTED = layout.offsetof(2);
        M_NNUMDROPPEDFRAMES = layout.offsetof(3);
        M_NREPROJECTIONFLAGS = layout.offsetof(4);
    }

    /**
     * Creates a {@code DriverDirectModeFrameTiming} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DriverDirectModeFrameTiming(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** sSet to {@code sizeof( DriverDirectMode_FrameTiming )} */
    @NativeType("uint32_t")
    public int m_nSize() { return nm_nSize(address()); }
    /** number of times frame was presented */
    @NativeType("uint32_t")
    public int m_nNumFramePresents() { return nm_nNumFramePresents(address()); }
    /** number of times frame was presented on a vsync other than it was originally predicted to */
    @NativeType("uint32_t")
    public int m_nNumMisPresented() { return nm_nNumMisPresented(address()); }
    /** number of additional times previous frame was scanned out (i.e. compositor missed vsync) */
    @NativeType("uint32_t")
    public int m_nNumDroppedFrames() { return nm_nNumDroppedFrames(address()); }
    /** @return the value of the {@code m_nReprojectionFlags} field. */
    @NativeType("uint32_t")
    public int m_nReprojectionFlags() { return nm_nReprojectionFlags(address()); }

    // -----------------------------------

    /** Returns a new {@code DriverDirectModeFrameTiming} instance for the specified memory address. */
    public static DriverDirectModeFrameTiming create(long address) {
        return wrap(DriverDirectModeFrameTiming.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DriverDirectModeFrameTiming createSafe(long address) {
        return address == NULL ? null : wrap(DriverDirectModeFrameTiming.class, address);
    }

    /**
     * Create a {@link DriverDirectModeFrameTiming.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DriverDirectModeFrameTiming.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DriverDirectModeFrameTiming.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nSize}. */
    public static int nm_nSize(long struct) { return UNSAFE.getInt(null, struct + DriverDirectModeFrameTiming.M_NSIZE); }
    /** Unsafe version of {@link #m_nNumFramePresents}. */
    public static int nm_nNumFramePresents(long struct) { return UNSAFE.getInt(null, struct + DriverDirectModeFrameTiming.M_NNUMFRAMEPRESENTS); }
    /** Unsafe version of {@link #m_nNumMisPresented}. */
    public static int nm_nNumMisPresented(long struct) { return UNSAFE.getInt(null, struct + DriverDirectModeFrameTiming.M_NNUMMISPRESENTED); }
    /** Unsafe version of {@link #m_nNumDroppedFrames}. */
    public static int nm_nNumDroppedFrames(long struct) { return UNSAFE.getInt(null, struct + DriverDirectModeFrameTiming.M_NNUMDROPPEDFRAMES); }
    /** Unsafe version of {@link #m_nReprojectionFlags}. */
    public static int nm_nReprojectionFlags(long struct) { return UNSAFE.getInt(null, struct + DriverDirectModeFrameTiming.M_NREPROJECTIONFLAGS); }

    // -----------------------------------

    /** An array of {@link DriverDirectModeFrameTiming} structs. */
    public static class Buffer extends StructBuffer<DriverDirectModeFrameTiming, Buffer> {

        private static final DriverDirectModeFrameTiming ELEMENT_FACTORY = DriverDirectModeFrameTiming.create(-1L);

        /**
         * Creates a new {@code DriverDirectModeFrameTiming.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DriverDirectModeFrameTiming#SIZEOF}, and its mark will be undefined.
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
        protected DriverDirectModeFrameTiming getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link DriverDirectModeFrameTiming#m_nSize} field. */
        @NativeType("uint32_t")
        public int m_nSize() { return DriverDirectModeFrameTiming.nm_nSize(address()); }
        /** @return the value of the {@link DriverDirectModeFrameTiming#m_nNumFramePresents} field. */
        @NativeType("uint32_t")
        public int m_nNumFramePresents() { return DriverDirectModeFrameTiming.nm_nNumFramePresents(address()); }
        /** @return the value of the {@link DriverDirectModeFrameTiming#m_nNumMisPresented} field. */
        @NativeType("uint32_t")
        public int m_nNumMisPresented() { return DriverDirectModeFrameTiming.nm_nNumMisPresented(address()); }
        /** @return the value of the {@link DriverDirectModeFrameTiming#m_nNumDroppedFrames} field. */
        @NativeType("uint32_t")
        public int m_nNumDroppedFrames() { return DriverDirectModeFrameTiming.nm_nNumDroppedFrames(address()); }
        /** @return the value of the {@code m_nReprojectionFlags} field. */
        @NativeType("uint32_t")
        public int m_nReprojectionFlags() { return DriverDirectModeFrameTiming.nm_nReprojectionFlags(address()); }

    }

}