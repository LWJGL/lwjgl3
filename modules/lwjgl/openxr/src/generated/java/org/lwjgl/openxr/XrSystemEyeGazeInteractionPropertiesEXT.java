/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Eye gaze interaction system properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTEyeGazeInteraction XR_EXT_eye_gaze_interaction} extension <b>must</b> be enabled prior to using {@link XrSystemEyeGazeInteractionPropertiesEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTEyeGazeInteraction#XR_TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemEyeGazeInteractionPropertiesEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsEyeGazeInteraction};
 * }</code></pre>
 */
public class XrSystemEyeGazeInteractionPropertiesEXT extends Struct<XrSystemEyeGazeInteractionPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSEYEGAZEINTERACTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSEYEGAZEINTERACTION = layout.offsetof(2);
    }

    protected XrSystemEyeGazeInteractionPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemEyeGazeInteractionPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSystemEyeGazeInteractionPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrSystemEyeGazeInteractionPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemEyeGazeInteractionPropertiesEXT(ByteBuffer container) {
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
    /** the runtime <b>must</b> set this value to {@link XR10#XR_TRUE TRUE} when eye gaze sufficient for use cases such as aiming or targeting is supported by the current device, otherwise the runtime <b>must</b> set this to {@link XR10#XR_FALSE FALSE}. */
    @NativeType("XrBool32")
    public boolean supportsEyeGazeInteraction() { return nsupportsEyeGazeInteraction(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemEyeGazeInteractionPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTEyeGazeInteraction#XR_TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT} value to the {@link #type} field. */
    public XrSystemEyeGazeInteractionPropertiesEXT type$Default() { return type(EXTEyeGazeInteraction.XR_TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemEyeGazeInteractionPropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemEyeGazeInteractionPropertiesEXT set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemEyeGazeInteractionPropertiesEXT set(XrSystemEyeGazeInteractionPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemEyeGazeInteractionPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemEyeGazeInteractionPropertiesEXT malloc() {
        return new XrSystemEyeGazeInteractionPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEyeGazeInteractionPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemEyeGazeInteractionPropertiesEXT calloc() {
        return new XrSystemEyeGazeInteractionPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEyeGazeInteractionPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrSystemEyeGazeInteractionPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemEyeGazeInteractionPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemEyeGazeInteractionPropertiesEXT} instance for the specified memory address. */
    public static XrSystemEyeGazeInteractionPropertiesEXT create(long address) {
        return new XrSystemEyeGazeInteractionPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemEyeGazeInteractionPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrSystemEyeGazeInteractionPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrSystemEyeGazeInteractionPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemEyeGazeInteractionPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEyeGazeInteractionPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemEyeGazeInteractionPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemEyeGazeInteractionPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemEyeGazeInteractionPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT malloc(MemoryStack stack) {
        return new XrSystemEyeGazeInteractionPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemEyeGazeInteractionPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT calloc(MemoryStack stack) {
        return new XrSystemEyeGazeInteractionPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemEyeGazeInteractionPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEyeGazeInteractionPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEyeGazeInteractionPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemEyeGazeInteractionPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemEyeGazeInteractionPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #supportsEyeGazeInteraction}. */
    public static int nsupportsEyeGazeInteraction(long struct) { return memGetInt(struct + XrSystemEyeGazeInteractionPropertiesEXT.SUPPORTSEYEGAZEINTERACTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemEyeGazeInteractionPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemEyeGazeInteractionPropertiesEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemEyeGazeInteractionPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrSystemEyeGazeInteractionPropertiesEXT, Buffer> implements NativeResource {

        private static final XrSystemEyeGazeInteractionPropertiesEXT ELEMENT_FACTORY = XrSystemEyeGazeInteractionPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrSystemEyeGazeInteractionPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemEyeGazeInteractionPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSystemEyeGazeInteractionPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemEyeGazeInteractionPropertiesEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemEyeGazeInteractionPropertiesEXT.ntype(address()); }
        /** @return the value of the {@link XrSystemEyeGazeInteractionPropertiesEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemEyeGazeInteractionPropertiesEXT.nnext(address()); }
        /** @return the value of the {@link XrSystemEyeGazeInteractionPropertiesEXT#supportsEyeGazeInteraction} field. */
        @NativeType("XrBool32")
        public boolean supportsEyeGazeInteraction() { return XrSystemEyeGazeInteractionPropertiesEXT.nsupportsEyeGazeInteraction(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemEyeGazeInteractionPropertiesEXT#type} field. */
        public XrSystemEyeGazeInteractionPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemEyeGazeInteractionPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTEyeGazeInteraction#XR_TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT} value to the {@link XrSystemEyeGazeInteractionPropertiesEXT#type} field. */
        public XrSystemEyeGazeInteractionPropertiesEXT.Buffer type$Default() { return type(EXTEyeGazeInteraction.XR_TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link XrSystemEyeGazeInteractionPropertiesEXT#next} field. */
        public XrSystemEyeGazeInteractionPropertiesEXT.Buffer next(@NativeType("void *") long value) { XrSystemEyeGazeInteractionPropertiesEXT.nnext(address(), value); return this; }

    }

}