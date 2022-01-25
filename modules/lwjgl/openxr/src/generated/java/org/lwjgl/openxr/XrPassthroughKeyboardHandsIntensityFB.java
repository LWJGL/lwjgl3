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
 * A struct for setting the level of intensity for hands in the passthrough layer.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrPassthroughKeyboardHandsIntensityFB} describes intensities of passthrough hands, and is used as a parameter to {@link FBPassthroughKeyboardHands#xrPassthroughLayerSetKeyboardHandsIntensityFB PassthroughLayerSetKeyboardHandsIntensityFB}.</p>
 * 
 * <p>Each of the intensity values {@code leftHandIntensity} and {@code rightHandIntensity} <b>must</b> be in the range [0.0, 1.0]. The hand intensity value represents the level of visibility of rendered hand, the minimal value of the intensity 0.0 represents the fully transparent hand (not visible), the maximal value of 1.0 represented fully opaque hands (maximal visibility).</p>
 * 
 * <p>If either {@code leftHandIntensity} or {@code rightHandIntensity} is outside the range [0.0, 1.0], the runtime must return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthroughKeyboardHands XR_FB_passthrough_keyboard_hands} extension <b>must</b> be enabled prior to using {@link XrPassthroughKeyboardHandsIntensityFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthroughKeyboardHands#XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBPassthroughKeyboardHands#xrPassthroughLayerSetKeyboardHandsIntensityFB PassthroughLayerSetKeyboardHandsIntensityFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughKeyboardHandsIntensityFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     float {@link #leftHandIntensity};
 *     float {@link #rightHandIntensity};
 * }</code></pre>
 */
public class XrPassthroughKeyboardHandsIntensityFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LEFTHANDINTENSITY,
        RIGHTHANDINTENSITY;

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
        LEFTHANDINTENSITY = layout.offsetof(2);
        RIGHTHANDINTENSITY = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrPassthroughKeyboardHandsIntensityFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughKeyboardHandsIntensityFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** defines an intensity for the left tracked hand. */
    public float leftHandIntensity() { return nleftHandIntensity(address()); }
    /** defines an intensity for the right tracked hand. */
    public float rightHandIntensity() { return nrightHandIntensity(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPassthroughKeyboardHandsIntensityFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthroughKeyboardHands#XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB} value to the {@link #type} field. */
    public XrPassthroughKeyboardHandsIntensityFB type$Default() { return type(FBPassthroughKeyboardHands.XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPassthroughKeyboardHandsIntensityFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #leftHandIntensity} field. */
    public XrPassthroughKeyboardHandsIntensityFB leftHandIntensity(float value) { nleftHandIntensity(address(), value); return this; }
    /** Sets the specified value to the {@link #rightHandIntensity} field. */
    public XrPassthroughKeyboardHandsIntensityFB rightHandIntensity(float value) { nrightHandIntensity(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughKeyboardHandsIntensityFB set(
        int type,
        long next,
        float leftHandIntensity,
        float rightHandIntensity
    ) {
        type(type);
        next(next);
        leftHandIntensity(leftHandIntensity);
        rightHandIntensity(rightHandIntensity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughKeyboardHandsIntensityFB set(XrPassthroughKeyboardHandsIntensityFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughKeyboardHandsIntensityFB malloc() {
        return wrap(XrPassthroughKeyboardHandsIntensityFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughKeyboardHandsIntensityFB calloc() {
        return wrap(XrPassthroughKeyboardHandsIntensityFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughKeyboardHandsIntensityFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrPassthroughKeyboardHandsIntensityFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance for the specified memory address. */
    public static XrPassthroughKeyboardHandsIntensityFB create(long address) {
        return wrap(XrPassthroughKeyboardHandsIntensityFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughKeyboardHandsIntensityFB createSafe(long address) {
        return address == NULL ? null : wrap(XrPassthroughKeyboardHandsIntensityFB.class, address);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughKeyboardHandsIntensityFB malloc(MemoryStack stack) {
        return wrap(XrPassthroughKeyboardHandsIntensityFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughKeyboardHandsIntensityFB calloc(MemoryStack stack) {
        return wrap(XrPassthroughKeyboardHandsIntensityFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughKeyboardHandsIntensityFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughKeyboardHandsIntensityFB.NEXT); }
    /** Unsafe version of {@link #leftHandIntensity}. */
    public static float nleftHandIntensity(long struct) { return UNSAFE.getFloat(null, struct + XrPassthroughKeyboardHandsIntensityFB.LEFTHANDINTENSITY); }
    /** Unsafe version of {@link #rightHandIntensity}. */
    public static float nrightHandIntensity(long struct) { return UNSAFE.getFloat(null, struct + XrPassthroughKeyboardHandsIntensityFB.RIGHTHANDINTENSITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughKeyboardHandsIntensityFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughKeyboardHandsIntensityFB.NEXT, value); }
    /** Unsafe version of {@link #leftHandIntensity(float) leftHandIntensity}. */
    public static void nleftHandIntensity(long struct, float value) { UNSAFE.putFloat(null, struct + XrPassthroughKeyboardHandsIntensityFB.LEFTHANDINTENSITY, value); }
    /** Unsafe version of {@link #rightHandIntensity(float) rightHandIntensity}. */
    public static void nrightHandIntensity(long struct, float value) { UNSAFE.putFloat(null, struct + XrPassthroughKeyboardHandsIntensityFB.RIGHTHANDINTENSITY, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughKeyboardHandsIntensityFB} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughKeyboardHandsIntensityFB, Buffer> implements NativeResource {

        private static final XrPassthroughKeyboardHandsIntensityFB ELEMENT_FACTORY = XrPassthroughKeyboardHandsIntensityFB.create(-1L);

        /**
         * Creates a new {@code XrPassthroughKeyboardHandsIntensityFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughKeyboardHandsIntensityFB#SIZEOF}, and its mark will be undefined.
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
        protected XrPassthroughKeyboardHandsIntensityFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughKeyboardHandsIntensityFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughKeyboardHandsIntensityFB.ntype(address()); }
        /** @return the value of the {@link XrPassthroughKeyboardHandsIntensityFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughKeyboardHandsIntensityFB.nnext(address()); }
        /** @return the value of the {@link XrPassthroughKeyboardHandsIntensityFB#leftHandIntensity} field. */
        public float leftHandIntensity() { return XrPassthroughKeyboardHandsIntensityFB.nleftHandIntensity(address()); }
        /** @return the value of the {@link XrPassthroughKeyboardHandsIntensityFB#rightHandIntensity} field. */
        public float rightHandIntensity() { return XrPassthroughKeyboardHandsIntensityFB.nrightHandIntensity(address()); }

        /** Sets the specified value to the {@link XrPassthroughKeyboardHandsIntensityFB#type} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughKeyboardHandsIntensityFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthroughKeyboardHands#XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB} value to the {@link XrPassthroughKeyboardHandsIntensityFB#type} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer type$Default() { return type(FBPassthroughKeyboardHands.XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB); }
        /** Sets the specified value to the {@link XrPassthroughKeyboardHandsIntensityFB#next} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer next(@NativeType("void const *") long value) { XrPassthroughKeyboardHandsIntensityFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughKeyboardHandsIntensityFB#leftHandIntensity} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer leftHandIntensity(float value) { XrPassthroughKeyboardHandsIntensityFB.nleftHandIntensity(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughKeyboardHandsIntensityFB#rightHandIntensity} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer rightHandIntensity(float value) { XrPassthroughKeyboardHandsIntensityFB.nrightHandIntensity(address(), value); return this; }

    }

}