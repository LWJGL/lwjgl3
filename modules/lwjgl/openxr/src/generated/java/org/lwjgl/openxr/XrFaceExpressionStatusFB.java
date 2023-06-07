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
 * Describes the status of facial expression weights.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the returned {@code isValid} is {@link XR10#XR_FALSE FALSE}, then it indicates that the face tracker failed to track or lost track of the face, or the application lost focus, or the consent for face tracking was denied.</p>
 * 
 * <p>If the returned {@code isValid} is {@link XR10#XR_TRUE TRUE}, the runtime <b>must</b> return all weights (or all weights except eyes related weights, see {@code isEyeFollowingBlendshapesValid}).</p>
 * 
 * <p>If the returned {@code isEyeFollowingBlendshapesValid} is {@link XR10#XR_FALSE FALSE}, then it indicates that the eye tracking driving blendshapes with prefix {@code XR_FACE_EXPRESSION_EYES_LOOK_*} lost track or the consent for eye tracking was denied.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using {@link XrFaceExpressionStatusFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFaceExpressionWeightsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFaceExpressionStatusFB {
 *     XrBool32 {@link #isValid};
 *     XrBool32 {@link #isEyeFollowingBlendshapesValid};
 * }</code></pre>
 */
public class XrFaceExpressionStatusFB extends Struct<XrFaceExpressionStatusFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISVALID,
        ISEYEFOLLOWINGBLENDSHAPESVALID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISVALID = layout.offsetof(0);
        ISEYEFOLLOWINGBLENDSHAPESVALID = layout.offsetof(1);
    }

    protected XrFaceExpressionStatusFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceExpressionStatusFB create(long address, @Nullable ByteBuffer container) {
        return new XrFaceExpressionStatusFB(address, container);
    }

    /**
     * Creates a {@code XrFaceExpressionStatusFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceExpressionStatusFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@code XrBool32} which indicates that the tracked expression weights are valid. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }
    /** an {@code XrBool32} which indicates if the 8 expression weights with prefix {@code XR_FACE_EXPRESSION_EYES_LOOK_*} are valid. */
    @NativeType("XrBool32")
    public boolean isEyeFollowingBlendshapesValid() { return nisEyeFollowingBlendshapesValid(address()) != 0; }

    /** Sets the specified value to the {@link #isValid} field. */
    public XrFaceExpressionStatusFB isValid(@NativeType("XrBool32") boolean value) { nisValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #isEyeFollowingBlendshapesValid} field. */
    public XrFaceExpressionStatusFB isEyeFollowingBlendshapesValid(@NativeType("XrBool32") boolean value) { nisEyeFollowingBlendshapesValid(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceExpressionStatusFB set(
        boolean isValid,
        boolean isEyeFollowingBlendshapesValid
    ) {
        isValid(isValid);
        isEyeFollowingBlendshapesValid(isEyeFollowingBlendshapesValid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceExpressionStatusFB set(XrFaceExpressionStatusFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceExpressionStatusFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionStatusFB malloc() {
        return new XrFaceExpressionStatusFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionStatusFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionStatusFB calloc() {
        return new XrFaceExpressionStatusFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionStatusFB} instance allocated with {@link BufferUtils}. */
    public static XrFaceExpressionStatusFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceExpressionStatusFB(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceExpressionStatusFB} instance for the specified memory address. */
    public static XrFaceExpressionStatusFB create(long address) {
        return new XrFaceExpressionStatusFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFaceExpressionStatusFB createSafe(long address) {
        return address == NULL ? null : new XrFaceExpressionStatusFB(address, null);
    }

    /**
     * Returns a new {@link XrFaceExpressionStatusFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionStatusFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionStatusFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionStatusFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionStatusFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionStatusFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceExpressionStatusFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionStatusFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFaceExpressionStatusFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceExpressionStatusFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionStatusFB malloc(MemoryStack stack) {
        return new XrFaceExpressionStatusFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceExpressionStatusFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionStatusFB calloc(MemoryStack stack) {
        return new XrFaceExpressionStatusFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceExpressionStatusFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionStatusFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionStatusFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionStatusFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionStatusFB.ISVALID); }
    /** Unsafe version of {@link #isEyeFollowingBlendshapesValid}. */
    public static int nisEyeFollowingBlendshapesValid(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionStatusFB.ISEYEFOLLOWINGBLENDSHAPESVALID); }

    /** Unsafe version of {@link #isValid(boolean) isValid}. */
    public static void nisValid(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionStatusFB.ISVALID, value); }
    /** Unsafe version of {@link #isEyeFollowingBlendshapesValid(boolean) isEyeFollowingBlendshapesValid}. */
    public static void nisEyeFollowingBlendshapesValid(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionStatusFB.ISEYEFOLLOWINGBLENDSHAPESVALID, value); }

    // -----------------------------------

    /** An array of {@link XrFaceExpressionStatusFB} structs. */
    public static class Buffer extends StructBuffer<XrFaceExpressionStatusFB, Buffer> implements NativeResource {

        private static final XrFaceExpressionStatusFB ELEMENT_FACTORY = XrFaceExpressionStatusFB.create(-1L);

        /**
         * Creates a new {@code XrFaceExpressionStatusFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceExpressionStatusFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceExpressionStatusFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFaceExpressionStatusFB#isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrFaceExpressionStatusFB.nisValid(address()) != 0; }
        /** @return the value of the {@link XrFaceExpressionStatusFB#isEyeFollowingBlendshapesValid} field. */
        @NativeType("XrBool32")
        public boolean isEyeFollowingBlendshapesValid() { return XrFaceExpressionStatusFB.nisEyeFollowingBlendshapesValid(address()) != 0; }

        /** Sets the specified value to the {@link XrFaceExpressionStatusFB#isValid} field. */
        public XrFaceExpressionStatusFB.Buffer isValid(@NativeType("XrBool32") boolean value) { XrFaceExpressionStatusFB.nisValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrFaceExpressionStatusFB#isEyeFollowingBlendshapesValid} field. */
        public XrFaceExpressionStatusFB.Buffer isEyeFollowingBlendshapesValid(@NativeType("XrBool32") boolean value) { XrFaceExpressionStatusFB.nisEyeFollowingBlendshapesValid(address(), value ? 1 : 0); return this; }

    }

}