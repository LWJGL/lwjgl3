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
 * State for a single animation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrVirtualKeyboardAnimationStateMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrVirtualKeyboardModelAnimationStatesMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVirtualKeyboardAnimationStateMETA {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     int32_t {@link #animationIndex};
 *     float {@link #fraction};
 * }</code></pre>
 */
public class XrVirtualKeyboardAnimationStateMETA extends Struct<XrVirtualKeyboardAnimationStateMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ANIMATIONINDEX,
        FRACTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ANIMATIONINDEX = layout.offsetof(2);
        FRACTION = layout.offsetof(3);
    }

    protected XrVirtualKeyboardAnimationStateMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardAnimationStateMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardAnimationStateMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardAnimationStateMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardAnimationStateMETA(ByteBuffer container) {
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
    /** the index of the animation to use for the render model. */
    @NativeType("int32_t")
    public int animationIndex() { return nanimationIndex(address()); }
    /** the normalized value between the start and end time of the animation. */
    public float fraction() { return nfraction(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVirtualKeyboardAnimationStateMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META} value to the {@link #type} field. */
    public XrVirtualKeyboardAnimationStateMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVirtualKeyboardAnimationStateMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #animationIndex} field. */
    public XrVirtualKeyboardAnimationStateMETA animationIndex(@NativeType("int32_t") int value) { nanimationIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #fraction} field. */
    public XrVirtualKeyboardAnimationStateMETA fraction(float value) { nfraction(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardAnimationStateMETA set(
        int type,
        long next,
        int animationIndex,
        float fraction
    ) {
        type(type);
        next(next);
        animationIndex(animationIndex);
        fraction(fraction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVirtualKeyboardAnimationStateMETA set(XrVirtualKeyboardAnimationStateMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardAnimationStateMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardAnimationStateMETA malloc() {
        return new XrVirtualKeyboardAnimationStateMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardAnimationStateMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardAnimationStateMETA calloc() {
        return new XrVirtualKeyboardAnimationStateMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardAnimationStateMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardAnimationStateMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardAnimationStateMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardAnimationStateMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardAnimationStateMETA create(long address) {
        return new XrVirtualKeyboardAnimationStateMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardAnimationStateMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardAnimationStateMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardAnimationStateMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardAnimationStateMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardAnimationStateMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardAnimationStateMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardAnimationStateMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardAnimationStateMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardAnimationStateMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardAnimationStateMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardAnimationStateMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardAnimationStateMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardAnimationStateMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardAnimationStateMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardAnimationStateMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardAnimationStateMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardAnimationStateMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardAnimationStateMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardAnimationStateMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardAnimationStateMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardAnimationStateMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardAnimationStateMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardAnimationStateMETA.NEXT); }
    /** Unsafe version of {@link #animationIndex}. */
    public static int nanimationIndex(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardAnimationStateMETA.ANIMATIONINDEX); }
    /** Unsafe version of {@link #fraction}. */
    public static float nfraction(long struct) { return UNSAFE.getFloat(null, struct + XrVirtualKeyboardAnimationStateMETA.FRACTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardAnimationStateMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardAnimationStateMETA.NEXT, value); }
    /** Unsafe version of {@link #animationIndex(int) animationIndex}. */
    public static void nanimationIndex(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardAnimationStateMETA.ANIMATIONINDEX, value); }
    /** Unsafe version of {@link #fraction(float) fraction}. */
    public static void nfraction(long struct, float value) { UNSAFE.putFloat(null, struct + XrVirtualKeyboardAnimationStateMETA.FRACTION, value); }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardAnimationStateMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardAnimationStateMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardAnimationStateMETA ELEMENT_FACTORY = XrVirtualKeyboardAnimationStateMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardAnimationStateMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardAnimationStateMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardAnimationStateMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVirtualKeyboardAnimationStateMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardAnimationStateMETA.ntype(address()); }
        /** @return the value of the {@link XrVirtualKeyboardAnimationStateMETA#next} field. */
        @NativeType("void *")
        public long next() { return XrVirtualKeyboardAnimationStateMETA.nnext(address()); }
        /** @return the value of the {@link XrVirtualKeyboardAnimationStateMETA#animationIndex} field. */
        @NativeType("int32_t")
        public int animationIndex() { return XrVirtualKeyboardAnimationStateMETA.nanimationIndex(address()); }
        /** @return the value of the {@link XrVirtualKeyboardAnimationStateMETA#fraction} field. */
        public float fraction() { return XrVirtualKeyboardAnimationStateMETA.nfraction(address()); }

        /** Sets the specified value to the {@link XrVirtualKeyboardAnimationStateMETA#type} field. */
        public XrVirtualKeyboardAnimationStateMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardAnimationStateMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META} value to the {@link XrVirtualKeyboardAnimationStateMETA#type} field. */
        public XrVirtualKeyboardAnimationStateMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META); }
        /** Sets the specified value to the {@link XrVirtualKeyboardAnimationStateMETA#next} field. */
        public XrVirtualKeyboardAnimationStateMETA.Buffer next(@NativeType("void *") long value) { XrVirtualKeyboardAnimationStateMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardAnimationStateMETA#animationIndex} field. */
        public XrVirtualKeyboardAnimationStateMETA.Buffer animationIndex(@NativeType("int32_t") int value) { XrVirtualKeyboardAnimationStateMETA.nanimationIndex(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardAnimationStateMETA#fraction} field. */
        public XrVirtualKeyboardAnimationStateMETA.Buffer fraction(float value) { XrVirtualKeyboardAnimationStateMETA.nfraction(address(), value); return this; }

    }

}