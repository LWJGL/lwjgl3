/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The information to create a foveation profile for foveation levels.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBFoveationConfiguration XR_FB_foveation_configuration} extension <b>must</b> be enabled prior to using {@link XrFoveationLevelProfileCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBFoveationConfiguration#XR_TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code level} <b>must</b> be a valid {@code XrFoveationLevelFB} value</li>
 * <li>{@code dynamic} <b>must</b> be a valid {@code XrFoveationDynamicFB} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationLevelProfileCreateInfoFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrFoveationLevelFB {@link #level};
 *     float {@link #verticalOffset};
 *     XrFoveationDynamicFB {@link #dynamic};
 * }</code></pre>
 */
public class XrFoveationLevelProfileCreateInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LEVEL,
        VERTICALOFFSET,
        DYNAMIC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LEVEL = layout.offsetof(2);
        VERTICALOFFSET = layout.offsetof(3);
        DYNAMIC = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrFoveationLevelProfileCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationLevelProfileCreateInfoFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the maximum desired foveation level. */
    @NativeType("XrFoveationLevelFB")
    public int level() { return nlevel(address()); }
    /** the desired vertical offset in degrees for the center of the foveation pattern. */
    public float verticalOffset() { return nverticalOffset(address()); }
    /** the desired dynamic foveation setting. */
    @NativeType("XrFoveationDynamicFB")
    public int dynamic() { return ndynamic(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveationLevelProfileCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFoveationConfiguration#XR_TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB} value to the {@link #type} field. */
    public XrFoveationLevelProfileCreateInfoFB type$Default() { return type(FBFoveationConfiguration.XR_TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveationLevelProfileCreateInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #level} field. */
    public XrFoveationLevelProfileCreateInfoFB level(@NativeType("XrFoveationLevelFB") int value) { nlevel(address(), value); return this; }
    /** Sets the specified value to the {@link #verticalOffset} field. */
    public XrFoveationLevelProfileCreateInfoFB verticalOffset(float value) { nverticalOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #dynamic} field. */
    public XrFoveationLevelProfileCreateInfoFB dynamic(@NativeType("XrFoveationDynamicFB") int value) { ndynamic(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationLevelProfileCreateInfoFB set(
        int type,
        long next,
        int level,
        float verticalOffset,
        int dynamic
    ) {
        type(type);
        next(next);
        level(level);
        verticalOffset(verticalOffset);
        dynamic(dynamic);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFoveationLevelProfileCreateInfoFB set(XrFoveationLevelProfileCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationLevelProfileCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationLevelProfileCreateInfoFB malloc() {
        return wrap(XrFoveationLevelProfileCreateInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrFoveationLevelProfileCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationLevelProfileCreateInfoFB calloc() {
        return wrap(XrFoveationLevelProfileCreateInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrFoveationLevelProfileCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrFoveationLevelProfileCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrFoveationLevelProfileCreateInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationLevelProfileCreateInfoFB} instance for the specified memory address. */
    public static XrFoveationLevelProfileCreateInfoFB create(long address) {
        return wrap(XrFoveationLevelProfileCreateInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationLevelProfileCreateInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrFoveationLevelProfileCreateInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrFoveationLevelProfileCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationLevelProfileCreateInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationLevelProfileCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationLevelProfileCreateInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationLevelProfileCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationLevelProfileCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrFoveationLevelProfileCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationLevelProfileCreateInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationLevelProfileCreateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationLevelProfileCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationLevelProfileCreateInfoFB malloc(MemoryStack stack) {
        return wrap(XrFoveationLevelProfileCreateInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrFoveationLevelProfileCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationLevelProfileCreateInfoFB calloc(MemoryStack stack) {
        return wrap(XrFoveationLevelProfileCreateInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrFoveationLevelProfileCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationLevelProfileCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationLevelProfileCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationLevelProfileCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFoveationLevelProfileCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationLevelProfileCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #level}. */
    public static int nlevel(long struct) { return UNSAFE.getInt(null, struct + XrFoveationLevelProfileCreateInfoFB.LEVEL); }
    /** Unsafe version of {@link #verticalOffset}. */
    public static float nverticalOffset(long struct) { return UNSAFE.getFloat(null, struct + XrFoveationLevelProfileCreateInfoFB.VERTICALOFFSET); }
    /** Unsafe version of {@link #dynamic}. */
    public static int ndynamic(long struct) { return UNSAFE.getInt(null, struct + XrFoveationLevelProfileCreateInfoFB.DYNAMIC); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationLevelProfileCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationLevelProfileCreateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #level(int) level}. */
    public static void nlevel(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationLevelProfileCreateInfoFB.LEVEL, value); }
    /** Unsafe version of {@link #verticalOffset(float) verticalOffset}. */
    public static void nverticalOffset(long struct, float value) { UNSAFE.putFloat(null, struct + XrFoveationLevelProfileCreateInfoFB.VERTICALOFFSET, value); }
    /** Unsafe version of {@link #dynamic(int) dynamic}. */
    public static void ndynamic(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationLevelProfileCreateInfoFB.DYNAMIC, value); }

    // -----------------------------------

    /** An array of {@link XrFoveationLevelProfileCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrFoveationLevelProfileCreateInfoFB, Buffer> implements NativeResource {

        private static final XrFoveationLevelProfileCreateInfoFB ELEMENT_FACTORY = XrFoveationLevelProfileCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrFoveationLevelProfileCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationLevelProfileCreateInfoFB#SIZEOF}, and its mark will be undefined.
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
        protected XrFoveationLevelProfileCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationLevelProfileCreateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationLevelProfileCreateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrFoveationLevelProfileCreateInfoFB#next} field. */
        @NativeType("void *")
        public long next() { return XrFoveationLevelProfileCreateInfoFB.nnext(address()); }
        /** @return the value of the {@link XrFoveationLevelProfileCreateInfoFB#level} field. */
        @NativeType("XrFoveationLevelFB")
        public int level() { return XrFoveationLevelProfileCreateInfoFB.nlevel(address()); }
        /** @return the value of the {@link XrFoveationLevelProfileCreateInfoFB#verticalOffset} field. */
        public float verticalOffset() { return XrFoveationLevelProfileCreateInfoFB.nverticalOffset(address()); }
        /** @return the value of the {@link XrFoveationLevelProfileCreateInfoFB#dynamic} field. */
        @NativeType("XrFoveationDynamicFB")
        public int dynamic() { return XrFoveationLevelProfileCreateInfoFB.ndynamic(address()); }

        /** Sets the specified value to the {@link XrFoveationLevelProfileCreateInfoFB#type} field. */
        public XrFoveationLevelProfileCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationLevelProfileCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBFoveationConfiguration#XR_TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB} value to the {@link XrFoveationLevelProfileCreateInfoFB#type} field. */
        public XrFoveationLevelProfileCreateInfoFB.Buffer type$Default() { return type(FBFoveationConfiguration.XR_TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB); }
        /** Sets the specified value to the {@link XrFoveationLevelProfileCreateInfoFB#next} field. */
        public XrFoveationLevelProfileCreateInfoFB.Buffer next(@NativeType("void *") long value) { XrFoveationLevelProfileCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFoveationLevelProfileCreateInfoFB#level} field. */
        public XrFoveationLevelProfileCreateInfoFB.Buffer level(@NativeType("XrFoveationLevelFB") int value) { XrFoveationLevelProfileCreateInfoFB.nlevel(address(), value); return this; }
        /** Sets the specified value to the {@link XrFoveationLevelProfileCreateInfoFB#verticalOffset} field. */
        public XrFoveationLevelProfileCreateInfoFB.Buffer verticalOffset(float value) { XrFoveationLevelProfileCreateInfoFB.nverticalOffset(address(), value); return this; }
        /** Sets the specified value to the {@link XrFoveationLevelProfileCreateInfoFB#dynamic} field. */
        public XrFoveationLevelProfileCreateInfoFB.Buffer dynamic(@NativeType("XrFoveationDynamicFB") int value) { XrFoveationLevelProfileCreateInfoFB.ndynamic(address(), value); return this; }

    }

}