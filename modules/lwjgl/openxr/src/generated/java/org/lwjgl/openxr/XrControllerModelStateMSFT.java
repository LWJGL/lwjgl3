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
 * Describes the state of a controller model.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTControllerModel XR_MSFT_controller_model} extension <b>must</b> be enabled prior to using {@link XrControllerModelStateMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_STATE_MSFT TYPE_CONTROLLER_MODEL_STATE_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code nodeCapacityInput} is not 0, {@code nodeStates} <b>must</b> be a pointer to an array of {@code nodeCapacityInput} {@link XrControllerModelNodeStateMSFT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrControllerModelNodeStateMSFT}, {@link MSFTControllerModel#xrGetControllerModelStateMSFT GetControllerModelStateMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrControllerModelStateMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #nodeCapacityInput};
 *     uint32_t {@link #nodeCountOutput};
 *     {@link XrControllerModelNodeStateMSFT XrControllerModelNodeStateMSFT} * {@link #nodeStates};
 * }</code></pre>
 */
public class XrControllerModelStateMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODECAPACITYINPUT,
        NODECOUNTOUTPUT,
        NODESTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODECAPACITYINPUT = layout.offsetof(2);
        NODECOUNTOUTPUT = layout.offsetof(3);
        NODESTATES = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrControllerModelStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrControllerModelStateMSFT(ByteBuffer container) {
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
    /** the capacity of the {@code nodeStates} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int nodeCapacityInput() { return nnodeCapacityInput(address()); }
    /** filled in by the runtime with the count of elements in {@code nodeStates} array, or returns the required capacity in the case that {@code nodeCapacityInput} is 0. */
    @NativeType("uint32_t")
    public int nodeCountOutput() { return nnodeCountOutput(address()); }
    /** a pointer to an application-allocated array that will be filled with the {@link XrControllerModelNodeStateMSFT} values. It <b>can</b> be {@code NULL} if {@code sourceCapacityInput} is 0. */
    @Nullable
    @NativeType("XrControllerModelNodeStateMSFT *")
    public XrControllerModelNodeStateMSFT.Buffer nodeStates() { return nnodeStates(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrControllerModelStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_STATE_MSFT TYPE_CONTROLLER_MODEL_STATE_MSFT} value to the {@link #type} field. */
    public XrControllerModelStateMSFT type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_STATE_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrControllerModelStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #nodeCapacityInput} field. */
    public XrControllerModelStateMSFT nodeCapacityInput(@NativeType("uint32_t") int value) { nnodeCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #nodeCountOutput} field. */
    public XrControllerModelStateMSFT nodeCountOutput(@NativeType("uint32_t") int value) { nnodeCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrControllerModelNodeStateMSFT.Buffer} to the {@link #nodeStates} field. */
    public XrControllerModelStateMSFT nodeStates(@Nullable @NativeType("XrControllerModelNodeStateMSFT *") XrControllerModelNodeStateMSFT.Buffer value) { nnodeStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrControllerModelStateMSFT set(
        int type,
        long next,
        int nodeCapacityInput,
        int nodeCountOutput,
        @Nullable XrControllerModelNodeStateMSFT.Buffer nodeStates
    ) {
        type(type);
        next(next);
        nodeCapacityInput(nodeCapacityInput);
        nodeCountOutput(nodeCountOutput);
        nodeStates(nodeStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrControllerModelStateMSFT set(XrControllerModelStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrControllerModelStateMSFT malloc() {
        return wrap(XrControllerModelStateMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrControllerModelStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrControllerModelStateMSFT calloc() {
        return wrap(XrControllerModelStateMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrControllerModelStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrControllerModelStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrControllerModelStateMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrControllerModelStateMSFT} instance for the specified memory address. */
    public static XrControllerModelStateMSFT create(long address) {
        return wrap(XrControllerModelStateMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelStateMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrControllerModelStateMSFT.class, address);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrControllerModelStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelStateMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrControllerModelStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelStateMSFT malloc(MemoryStack stack) {
        return wrap(XrControllerModelStateMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrControllerModelStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelStateMSFT calloc(MemoryStack stack) {
        return wrap(XrControllerModelStateMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrControllerModelStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrControllerModelStateMSFT.NEXT); }
    /** Unsafe version of {@link #nodeCapacityInput}. */
    public static int nnodeCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrControllerModelStateMSFT.NODECAPACITYINPUT); }
    /** Unsafe version of {@link #nodeCountOutput}. */
    public static int nnodeCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrControllerModelStateMSFT.NODECOUNTOUTPUT); }
    /** Unsafe version of {@link #nodeStates}. */
    @Nullable public static XrControllerModelNodeStateMSFT.Buffer nnodeStates(long struct) { return XrControllerModelNodeStateMSFT.createSafe(memGetAddress(struct + XrControllerModelStateMSFT.NODESTATES), nnodeCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrControllerModelStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrControllerModelStateMSFT.NEXT, value); }
    /** Sets the specified value to the {@code nodeCapacityInput} field of the specified {@code struct}. */
    public static void nnodeCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrControllerModelStateMSFT.NODECAPACITYINPUT, value); }
    /** Unsafe version of {@link #nodeCountOutput(int) nodeCountOutput}. */
    public static void nnodeCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrControllerModelStateMSFT.NODECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #nodeStates(XrControllerModelNodeStateMSFT.Buffer) nodeStates}. */
    public static void nnodeStates(long struct, @Nullable XrControllerModelNodeStateMSFT.Buffer value) { memPutAddress(struct + XrControllerModelStateMSFT.NODESTATES, memAddressSafe(value)); if (value != null) { nnodeCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrControllerModelStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrControllerModelStateMSFT, Buffer> implements NativeResource {

        private static final XrControllerModelStateMSFT ELEMENT_FACTORY = XrControllerModelStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrControllerModelStateMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrControllerModelStateMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrControllerModelStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrControllerModelStateMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelStateMSFT.ntype(address()); }
        /** @return the value of the {@link XrControllerModelStateMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelStateMSFT.nnext(address()); }
        /** @return the value of the {@link XrControllerModelStateMSFT#nodeCapacityInput} field. */
        @NativeType("uint32_t")
        public int nodeCapacityInput() { return XrControllerModelStateMSFT.nnodeCapacityInput(address()); }
        /** @return the value of the {@link XrControllerModelStateMSFT#nodeCountOutput} field. */
        @NativeType("uint32_t")
        public int nodeCountOutput() { return XrControllerModelStateMSFT.nnodeCountOutput(address()); }
        /** @return a {@link XrControllerModelNodeStateMSFT.Buffer} view of the struct array pointed to by the {@link XrControllerModelStateMSFT#nodeStates} field. */
        @Nullable
        @NativeType("XrControllerModelNodeStateMSFT *")
        public XrControllerModelNodeStateMSFT.Buffer nodeStates() { return XrControllerModelStateMSFT.nnodeStates(address()); }

        /** Sets the specified value to the {@link XrControllerModelStateMSFT#type} field. */
        public XrControllerModelStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelStateMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_STATE_MSFT TYPE_CONTROLLER_MODEL_STATE_MSFT} value to the {@link XrControllerModelStateMSFT#type} field. */
        public XrControllerModelStateMSFT.Buffer type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_STATE_MSFT); }
        /** Sets the specified value to the {@link XrControllerModelStateMSFT#next} field. */
        public XrControllerModelStateMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelStateMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrControllerModelStateMSFT#nodeCapacityInput} field. */
        public XrControllerModelStateMSFT.Buffer nodeCapacityInput(@NativeType("uint32_t") int value) { XrControllerModelStateMSFT.nnodeCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrControllerModelStateMSFT#nodeCountOutput} field. */
        public XrControllerModelStateMSFT.Buffer nodeCountOutput(@NativeType("uint32_t") int value) { XrControllerModelStateMSFT.nnodeCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrControllerModelNodeStateMSFT.Buffer} to the {@link XrControllerModelStateMSFT#nodeStates} field. */
        public XrControllerModelStateMSFT.Buffer nodeStates(@Nullable @NativeType("XrControllerModelNodeStateMSFT *") XrControllerModelNodeStateMSFT.Buffer value) { XrControllerModelStateMSFT.nnodeStates(address(), value); return this; }

    }

}