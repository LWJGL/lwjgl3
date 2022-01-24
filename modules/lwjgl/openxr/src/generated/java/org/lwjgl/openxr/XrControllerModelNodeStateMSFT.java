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
 * Describes the state of a node in a controller model.
 * 
 * <h5>Description</h5>
 * 
 * <p>The state is corresponding to the glTF node identified by the {@code nodeName} and {@code nodeParentName} of the node property at the same array index in the {@code nodeProperties} in {@link XrControllerModelPropertiesMSFT}.</p>
 * 
 * <p>The {@code nodePose} is based on the user’s interaction on the controller at the latest {@link XR10#xrSyncActions SyncActions}, represented as the {@link XrPosef} of the node in it’s parent node space.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using {@link XrControllerModelNodeStateMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrControllerModelStateMSFT}, {@link XrPosef}, {@link MSFTControllerModel#xrGetControllerModelStateMSFT GetControllerModelStateMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrControllerModelNodeStateMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     {@link XrPosef XrPosef} {@link #nodePose};
 * }</code></pre>
 */
public class XrControllerModelNodeStateMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODEPOSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODEPOSE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrControllerModelNodeStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrControllerModelNodeStateMSFT(ByteBuffer container) {
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
    /** an {@link XrPosef} of the node in its parent node space. */
    public XrPosef nodePose() { return nnodePose(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrControllerModelNodeStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT} value to the {@link #type} field. */
    public XrControllerModelNodeStateMSFT type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrControllerModelNodeStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #nodePose} field. */
    public XrControllerModelNodeStateMSFT nodePose(XrPosef value) { nnodePose(address(), value); return this; }
    /** Passes the {@link #nodePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrControllerModelNodeStateMSFT nodePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(nodePose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrControllerModelNodeStateMSFT set(
        int type,
        long next,
        XrPosef nodePose
    ) {
        type(type);
        next(next);
        nodePose(nodePose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrControllerModelNodeStateMSFT set(XrControllerModelNodeStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrControllerModelNodeStateMSFT malloc() {
        return wrap(XrControllerModelNodeStateMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrControllerModelNodeStateMSFT calloc() {
        return wrap(XrControllerModelNodeStateMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrControllerModelNodeStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrControllerModelNodeStateMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance for the specified memory address. */
    public static XrControllerModelNodeStateMSFT create(long address) {
        return wrap(XrControllerModelNodeStateMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelNodeStateMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrControllerModelNodeStateMSFT.class, address);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrControllerModelNodeStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelNodeStateMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodeStateMSFT malloc(MemoryStack stack) {
        return wrap(XrControllerModelNodeStateMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodeStateMSFT calloc(MemoryStack stack) {
        return wrap(XrControllerModelNodeStateMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrControllerModelNodeStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrControllerModelNodeStateMSFT.NEXT); }
    /** Unsafe version of {@link #nodePose}. */
    public static XrPosef nnodePose(long struct) { return XrPosef.create(struct + XrControllerModelNodeStateMSFT.NODEPOSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrControllerModelNodeStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrControllerModelNodeStateMSFT.NEXT, value); }
    /** Unsafe version of {@link #nodePose(XrPosef) nodePose}. */
    public static void nnodePose(long struct, XrPosef value) { memCopy(value.address(), struct + XrControllerModelNodeStateMSFT.NODEPOSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrControllerModelNodeStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrControllerModelNodeStateMSFT, Buffer> implements NativeResource {

        private static final XrControllerModelNodeStateMSFT ELEMENT_FACTORY = XrControllerModelNodeStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrControllerModelNodeStateMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrControllerModelNodeStateMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrControllerModelNodeStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrControllerModelNodeStateMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelNodeStateMSFT.ntype(address()); }
        /** @return the value of the {@link XrControllerModelNodeStateMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelNodeStateMSFT.nnext(address()); }
        /** @return a {@link XrPosef} view of the {@link XrControllerModelNodeStateMSFT#nodePose} field. */
        public XrPosef nodePose() { return XrControllerModelNodeStateMSFT.nnodePose(address()); }

        /** Sets the specified value to the {@link XrControllerModelNodeStateMSFT#type} field. */
        public XrControllerModelNodeStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelNodeStateMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT} value to the {@link XrControllerModelNodeStateMSFT#type} field. */
        public XrControllerModelNodeStateMSFT.Buffer type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT); }
        /** Sets the specified value to the {@link XrControllerModelNodeStateMSFT#next} field. */
        public XrControllerModelNodeStateMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelNodeStateMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrControllerModelNodeStateMSFT#nodePose} field. */
        public XrControllerModelNodeStateMSFT.Buffer nodePose(XrPosef value) { XrControllerModelNodeStateMSFT.nnodePose(address(), value); return this; }
        /** Passes the {@link XrControllerModelNodeStateMSFT#nodePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrControllerModelNodeStateMSFT.Buffer nodePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(nodePose()); return this; }

    }

}