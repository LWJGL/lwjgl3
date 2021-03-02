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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.MSFTControllerModel.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrControllerModelNodePropertiesMSFT {
 *     XrStructureType type;
 *     void * next;
 *     char parentNodeName[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT];
 *     char nodeName[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT];
 * }</code></pre>
 */
public class XrControllerModelNodePropertiesMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PARENTNODENAME,
        NODENAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT),
            __array(1, XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PARENTNODENAME = layout.offsetof(2);
        NODENAME = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrControllerModelNodePropertiesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrControllerModelNodePropertiesMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code parentNodeName} field. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public ByteBuffer parentNodeName() { return nparentNodeName(address()); }
    /** Decodes the null-terminated string stored in the {@code parentNodeName} field. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public String parentNodeNameString() { return nparentNodeNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code nodeName} field. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public ByteBuffer nodeName() { return nnodeName(address()); }
    /** Decodes the null-terminated string stored in the {@code nodeName} field. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public String nodeNameString() { return nnodeNameString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrControllerModelNodePropertiesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrControllerModelNodePropertiesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified encoded string to the {@code parentNodeName} field. */
    public XrControllerModelNodePropertiesMSFT parentNodeName(@NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]") ByteBuffer value) { nparentNodeName(address(), value); return this; }
    /** Copies the specified encoded string to the {@code nodeName} field. */
    public XrControllerModelNodePropertiesMSFT nodeName(@NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]") ByteBuffer value) { nnodeName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrControllerModelNodePropertiesMSFT set(
        int type,
        long next,
        ByteBuffer parentNodeName,
        ByteBuffer nodeName
    ) {
        type(type);
        next(next);
        parentNodeName(parentNodeName);
        nodeName(nodeName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrControllerModelNodePropertiesMSFT set(XrControllerModelNodePropertiesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrControllerModelNodePropertiesMSFT malloc() {
        return wrap(XrControllerModelNodePropertiesMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrControllerModelNodePropertiesMSFT calloc() {
        return wrap(XrControllerModelNodePropertiesMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrControllerModelNodePropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrControllerModelNodePropertiesMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrControllerModelNodePropertiesMSFT} instance for the specified memory address. */
    public static XrControllerModelNodePropertiesMSFT create(long address) {
        return wrap(XrControllerModelNodePropertiesMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelNodePropertiesMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrControllerModelNodePropertiesMSFT.class, address);
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrControllerModelNodePropertiesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelNodePropertiesMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrControllerModelNodePropertiesMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrControllerModelNodePropertiesMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodePropertiesMSFT mallocStack(MemoryStack stack) {
        return wrap(XrControllerModelNodePropertiesMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodePropertiesMSFT callocStack(MemoryStack stack) {
        return wrap(XrControllerModelNodePropertiesMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrControllerModelNodePropertiesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrControllerModelNodePropertiesMSFT.NEXT); }
    /** Unsafe version of {@link #parentNodeName}. */
    public static ByteBuffer nparentNodeName(long struct) { return memByteBuffer(struct + XrControllerModelNodePropertiesMSFT.PARENTNODENAME, XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT); }
    /** Unsafe version of {@link #parentNodeNameString}. */
    public static String nparentNodeNameString(long struct) { return memUTF8(struct + XrControllerModelNodePropertiesMSFT.PARENTNODENAME); }
    /** Unsafe version of {@link #nodeName}. */
    public static ByteBuffer nnodeName(long struct) { return memByteBuffer(struct + XrControllerModelNodePropertiesMSFT.NODENAME, XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT); }
    /** Unsafe version of {@link #nodeNameString}. */
    public static String nnodeNameString(long struct) { return memUTF8(struct + XrControllerModelNodePropertiesMSFT.NODENAME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrControllerModelNodePropertiesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrControllerModelNodePropertiesMSFT.NEXT, value); }
    /** Unsafe version of {@link #parentNodeName(ByteBuffer) parentNodeName}. */
    public static void nparentNodeName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT);
        }
        memCopy(memAddress(value), struct + XrControllerModelNodePropertiesMSFT.PARENTNODENAME, value.remaining());
    }
    /** Unsafe version of {@link #nodeName(ByteBuffer) nodeName}. */
    public static void nnodeName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT);
        }
        memCopy(memAddress(value), struct + XrControllerModelNodePropertiesMSFT.NODENAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link XrControllerModelNodePropertiesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrControllerModelNodePropertiesMSFT, Buffer> implements NativeResource {

        private static final XrControllerModelNodePropertiesMSFT ELEMENT_FACTORY = XrControllerModelNodePropertiesMSFT.create(-1L);

        /**
         * Creates a new {@code XrControllerModelNodePropertiesMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrControllerModelNodePropertiesMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrControllerModelNodePropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelNodePropertiesMSFT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelNodePropertiesMSFT.nnext(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code parentNodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public ByteBuffer parentNodeName() { return XrControllerModelNodePropertiesMSFT.nparentNodeName(address()); }
        /** Decodes the null-terminated string stored in the {@code parentNodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public String parentNodeNameString() { return XrControllerModelNodePropertiesMSFT.nparentNodeNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code nodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public ByteBuffer nodeName() { return XrControllerModelNodePropertiesMSFT.nnodeName(address()); }
        /** Decodes the null-terminated string stored in the {@code nodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public String nodeNameString() { return XrControllerModelNodePropertiesMSFT.nnodeNameString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelNodePropertiesMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelNodePropertiesMSFT.nnext(address(), value); return this; }
        /** Copies the specified encoded string to the {@code parentNodeName} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer parentNodeName(@NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]") ByteBuffer value) { XrControllerModelNodePropertiesMSFT.nparentNodeName(address(), value); return this; }
        /** Copies the specified encoded string to the {@code nodeName} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer nodeName(@NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]") ByteBuffer value) { XrControllerModelNodePropertiesMSFT.nnodeName(address(), value); return this; }

    }

}