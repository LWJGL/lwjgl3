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
 * Describes the controller model node properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The node can be located in the glTF node hierarchy by finding the node(s) with the matching node name and parent node name. If the {@code parentNodeName} is empty, the matching will be solely based on the {@code nodeName}.</p>
 * 
 * <p>If there are multiple nodes in the glTF file matches the condition above, the first matching node using depth-first traversal in the glTF scene <b>should</b> be animated and the rest <b>should</b> be ignored.</p>
 * 
 * <p>The runtime <b>must</b> not return any {@code nodeName} or {@code parentName} that doesn’t match any gltTF nodes in the corresponding controller model.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using {@link XrControllerModelNodePropertiesMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code parentNodeName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link MSFTControllerModel#XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT}</li>
 * <li>{@code nodeName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link MSFTControllerModel#XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrControllerModelPropertiesMSFT}, {@link MSFTControllerModel#xrGetControllerModelPropertiesMSFT GetControllerModelPropertiesMSFT}, {@link MSFTControllerModel#xrLoadControllerModelMSFT LoadControllerModelMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrControllerModelNodePropertiesMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     char {@link #parentNodeName}[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT];
 *     char {@link #nodeName}[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT];
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the name of the parent node in the provided glTF file. The parent name <b>may</b> be empty if it should not be used to locate this node. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public ByteBuffer parentNodeName() { return nparentNodeName(address()); }
    /** the name of the parent node in the provided glTF file. The parent name <b>may</b> be empty if it should not be used to locate this node. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public String parentNodeNameString() { return nparentNodeNameString(address()); }
    /** the name of this node in the provided glTF file. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public ByteBuffer nodeName() { return nnodeName(address()); }
    /** the name of this node in the provided glTF file. */
    @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
    public String nodeNameString() { return nnodeNameString(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrControllerModelNodePropertiesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT} value to the {@link #type} field. */
    public XrControllerModelNodePropertiesMSFT type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrControllerModelNodePropertiesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #parentNodeName} field. */
    public XrControllerModelNodePropertiesMSFT parentNodeName(@NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]") ByteBuffer value) { nparentNodeName(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #nodeName} field. */
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

    /**
     * Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodePropertiesMSFT malloc(MemoryStack stack) {
        return wrap(XrControllerModelNodePropertiesMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrControllerModelNodePropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodePropertiesMSFT calloc(MemoryStack stack) {
        return wrap(XrControllerModelNodePropertiesMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodePropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodePropertiesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
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

        /** @return the value of the {@link XrControllerModelNodePropertiesMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelNodePropertiesMSFT.ntype(address()); }
        /** @return the value of the {@link XrControllerModelNodePropertiesMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelNodePropertiesMSFT.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrControllerModelNodePropertiesMSFT#parentNodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public ByteBuffer parentNodeName() { return XrControllerModelNodePropertiesMSFT.nparentNodeName(address()); }
        /** @return the null-terminated string stored in the {@link XrControllerModelNodePropertiesMSFT#parentNodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public String parentNodeNameString() { return XrControllerModelNodePropertiesMSFT.nparentNodeNameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrControllerModelNodePropertiesMSFT#nodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public ByteBuffer nodeName() { return XrControllerModelNodePropertiesMSFT.nnodeName(address()); }
        /** @return the null-terminated string stored in the {@link XrControllerModelNodePropertiesMSFT#nodeName} field. */
        @NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]")
        public String nodeNameString() { return XrControllerModelNodePropertiesMSFT.nnodeNameString(address()); }

        /** Sets the specified value to the {@link XrControllerModelNodePropertiesMSFT#type} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelNodePropertiesMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT} value to the {@link XrControllerModelNodePropertiesMSFT#type} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT); }
        /** Sets the specified value to the {@link XrControllerModelNodePropertiesMSFT#next} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelNodePropertiesMSFT.nnext(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrControllerModelNodePropertiesMSFT#parentNodeName} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer parentNodeName(@NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]") ByteBuffer value) { XrControllerModelNodePropertiesMSFT.nparentNodeName(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrControllerModelNodePropertiesMSFT#nodeName} field. */
        public XrControllerModelNodePropertiesMSFT.Buffer nodeName(@NativeType("char[XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT]") ByteBuffer value) { XrControllerModelNodePropertiesMSFT.nnodeName(address(), value); return this; }

    }

}