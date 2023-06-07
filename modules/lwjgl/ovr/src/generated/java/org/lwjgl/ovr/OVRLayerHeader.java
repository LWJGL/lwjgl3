/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines properties shared by all ovrLayer structs, such as {@link OVRLayerEyeFov}.
 * 
 * <p>{@code ovrLayerHeader} is used as a base member in these larger structs. This struct cannot be used by itself except for the case that {@code Type} is
 * {@link OVR#ovrLayerType_Disabled LayerType_Disabled}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrLayerHeader {
 *     ovrLayerType {@link #Type};
 *     unsigned int {@link #Flags};
 *     char[128];
 * }</code></pre>
 */
@NativeType("struct ovrLayerHeader")
public class OVRLayerHeader extends Struct<OVRLayerHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __member(4),
            __member(4),
            __padding(128, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
    }

    protected OVRLayerHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRLayerHeader create(long address, @Nullable ByteBuffer container) {
        return new OVRLayerHeader(address, container);
    }

    /**
     * Creates a {@code OVRLayerHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** described by {@code ovrLayerType}. One of:<br><table><tr><td>{@link OVR#ovrLayerType_Disabled LayerType_Disabled}</td><td>{@link OVR#ovrLayerType_EyeFov LayerType_EyeFov}</td><td>{@link OVR#ovrLayerType_EyeFovDepth LayerType_EyeFovDepth}</td><td>{@link OVR#ovrLayerType_Quad LayerType_Quad}</td></tr><tr><td>{@link OVR#ovrLayerType_EyeMatrix LayerType_EyeMatrix}</td><td>{@link OVR#ovrLayerType_EyeFovMultires LayerType_EyeFovMultires}</td><td>{@link OVR#ovrLayerType_Cylinder LayerType_Cylinder}</td><td>{@link OVR#ovrLayerType_Cube LayerType_Cube}</td></tr></table> */
    @NativeType("ovrLayerType")
    public int Type() { return nType(address()); }
    /** described by {@code ovrLayerFlags} */
    @NativeType("unsigned int")
    public int Flags() { return nFlags(address()); }

    /** Sets the specified value to the {@link #Type} field. */
    public OVRLayerHeader Type(@NativeType("ovrLayerType") int value) { nType(address(), value); return this; }
    /** Sets the specified value to the {@link #Flags} field. */
    public OVRLayerHeader Flags(@NativeType("unsigned int") int value) { nFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerHeader set(
        int Type,
        int Flags
    ) {
        Type(Type);
        Flags(Flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerHeader set(OVRLayerHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerHeader malloc() {
        return new OVRLayerHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRLayerHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerHeader calloc() {
        return new OVRLayerHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRLayerHeader} instance allocated with {@link BufferUtils}. */
    public static OVRLayerHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRLayerHeader(memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerHeader} instance for the specified memory address. */
    public static OVRLayerHeader create(long address) {
        return new OVRLayerHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerHeader createSafe(long address) {
        return address == NULL ? null : new OVRLayerHeader(address, null);
    }

    /**
     * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRLayerHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerHeader.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerHeader malloc(MemoryStack stack) {
        return new OVRLayerHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRLayerHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerHeader calloc(MemoryStack stack) {
        return new OVRLayerHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRLayerHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Type}. */
    public static int nType(long struct) { return UNSAFE.getInt(null, struct + OVRLayerHeader.TYPE); }
    /** Unsafe version of {@link #Flags}. */
    public static int nFlags(long struct) { return UNSAFE.getInt(null, struct + OVRLayerHeader.FLAGS); }

    /** Unsafe version of {@link #Type(int) Type}. */
    public static void nType(long struct, int value) { UNSAFE.putInt(null, struct + OVRLayerHeader.TYPE, value); }
    /** Unsafe version of {@link #Flags(int) Flags}. */
    public static void nFlags(long struct, int value) { UNSAFE.putInt(null, struct + OVRLayerHeader.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link OVRLayerHeader} structs. */
    public static class Buffer extends StructBuffer<OVRLayerHeader, Buffer> implements NativeResource {

        private static final OVRLayerHeader ELEMENT_FACTORY = OVRLayerHeader.create(-1L);

        /**
         * Creates a new {@code OVRLayerHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRLayerHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRLayerHeader#Type} field. */
        @NativeType("ovrLayerType")
        public int Type() { return OVRLayerHeader.nType(address()); }
        /** @return the value of the {@link OVRLayerHeader#Flags} field. */
        @NativeType("unsigned int")
        public int Flags() { return OVRLayerHeader.nFlags(address()); }

        /** Sets the specified value to the {@link OVRLayerHeader#Type} field. */
        public OVRLayerHeader.Buffer Type(@NativeType("ovrLayerType") int value) { OVRLayerHeader.nType(address(), value); return this; }
        /** Sets the specified value to the {@link OVRLayerHeader#Flags} field. */
        public OVRLayerHeader.Buffer Flags(@NativeType("unsigned int") int value) { OVRLayerHeader.nFlags(address(), value); return this; }

    }

}