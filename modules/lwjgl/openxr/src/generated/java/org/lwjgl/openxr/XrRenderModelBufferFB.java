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
 * The buffer containing the data for the render model.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrRenderModelBufferFB} is used when loading the binary data for a render model. {@link XrRenderModelBufferFB} <b>must</b> be provided when calling {@link FBRenderModel#xrLoadRenderModelFB LoadRenderModelFB}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using {@link XrRenderModelBufferFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBRenderModel#XR_TYPE_RENDER_MODEL_BUFFER_FB TYPE_RENDER_MODEL_BUFFER_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBRenderModel#xrLoadRenderModelFB LoadRenderModelFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRenderModelBufferFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #bufferCapacityInput};
 *     uint32_t {@link #bufferCountOutput};
 *     uint8_t * {@link #buffer};
 * }</code></pre>
 */
public class XrRenderModelBufferFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BUFFERCAPACITYINPUT,
        BUFFERCOUNTOUTPUT,
        BUFFER;

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
        BUFFERCAPACITYINPUT = layout.offsetof(2);
        BUFFERCOUNTOUTPUT = layout.offsetof(3);
        BUFFER = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrRenderModelBufferFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelBufferFB(ByteBuffer container) {
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
    /** the capacity of the {@code buffer}, or 0 to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int bufferCapacityInput() { return nbufferCapacityInput(address()); }
    /** the count of {@code uint8_t} {@code buffer} written, or the required capacity in the case that {@code bufferCapacityInput} is 0. */
    @NativeType("uint32_t")
    public int bufferCountOutput() { return nbufferCountOutput(address()); }
    /** a pointer to an application-allocated array that will be filled with the render model binary data. */
    @Nullable
    @NativeType("uint8_t *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrRenderModelBufferFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_BUFFER_FB TYPE_RENDER_MODEL_BUFFER_FB} value to the {@link #type} field. */
    public XrRenderModelBufferFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_BUFFER_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrRenderModelBufferFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferCapacityInput} field. */
    public XrRenderModelBufferFB bufferCapacityInput(@NativeType("uint32_t") int value) { nbufferCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferCountOutput} field. */
    public XrRenderModelBufferFB bufferCountOutput(@NativeType("uint32_t") int value) { nbufferCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #buffer} field. */
    public XrRenderModelBufferFB buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelBufferFB set(
        int type,
        long next,
        int bufferCapacityInput,
        int bufferCountOutput,
        @Nullable ByteBuffer buffer
    ) {
        type(type);
        next(next);
        bufferCapacityInput(bufferCapacityInput);
        bufferCountOutput(bufferCountOutput);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelBufferFB set(XrRenderModelBufferFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelBufferFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelBufferFB malloc() {
        return wrap(XrRenderModelBufferFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrRenderModelBufferFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelBufferFB calloc() {
        return wrap(XrRenderModelBufferFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrRenderModelBufferFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelBufferFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrRenderModelBufferFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelBufferFB} instance for the specified memory address. */
    public static XrRenderModelBufferFB create(long address) {
        return wrap(XrRenderModelBufferFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelBufferFB createSafe(long address) {
        return address == NULL ? null : wrap(XrRenderModelBufferFB.class, address);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrRenderModelBufferFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelBufferFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelBufferFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelBufferFB malloc(MemoryStack stack) {
        return wrap(XrRenderModelBufferFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrRenderModelBufferFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelBufferFB calloc(MemoryStack stack) {
        return wrap(XrRenderModelBufferFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelBufferFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelBufferFB.NEXT); }
    /** Unsafe version of {@link #bufferCapacityInput}. */
    public static int nbufferCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelBufferFB.BUFFERCAPACITYINPUT); }
    /** Unsafe version of {@link #bufferCountOutput}. */
    public static int nbufferCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelBufferFB.BUFFERCOUNTOUTPUT); }
    /** Unsafe version of {@link #buffer() buffer}. */
    @Nullable public static ByteBuffer nbuffer(long struct) { return memByteBufferSafe(memGetAddress(struct + XrRenderModelBufferFB.BUFFER), nbufferCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelBufferFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelBufferFB.NEXT, value); }
    /** Sets the specified value to the {@code bufferCapacityInput} field of the specified {@code struct}. */
    public static void nbufferCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelBufferFB.BUFFERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #bufferCountOutput(int) bufferCountOutput}. */
    public static void nbufferCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelBufferFB.BUFFERCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrRenderModelBufferFB.BUFFER, memAddressSafe(value)); if (value != null) { nbufferCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRenderModelBufferFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelBufferFB, Buffer> implements NativeResource {

        private static final XrRenderModelBufferFB ELEMENT_FACTORY = XrRenderModelBufferFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelBufferFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelBufferFB#SIZEOF}, and its mark will be undefined.
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
        protected XrRenderModelBufferFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrRenderModelBufferFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelBufferFB.ntype(address()); }
        /** @return the value of the {@link XrRenderModelBufferFB#next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelBufferFB.nnext(address()); }
        /** @return the value of the {@link XrRenderModelBufferFB#bufferCapacityInput} field. */
        @NativeType("uint32_t")
        public int bufferCapacityInput() { return XrRenderModelBufferFB.nbufferCapacityInput(address()); }
        /** @return the value of the {@link XrRenderModelBufferFB#bufferCountOutput} field. */
        @NativeType("uint32_t")
        public int bufferCountOutput() { return XrRenderModelBufferFB.nbufferCountOutput(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link XrRenderModelBufferFB#buffer} field. */
        @Nullable
        @NativeType("uint8_t *")
        public ByteBuffer buffer() { return XrRenderModelBufferFB.nbuffer(address()); }

        /** Sets the specified value to the {@link XrRenderModelBufferFB#type} field. */
        public XrRenderModelBufferFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelBufferFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_BUFFER_FB TYPE_RENDER_MODEL_BUFFER_FB} value to the {@link XrRenderModelBufferFB#type} field. */
        public XrRenderModelBufferFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_BUFFER_FB); }
        /** Sets the specified value to the {@link XrRenderModelBufferFB#next} field. */
        public XrRenderModelBufferFB.Buffer next(@NativeType("void *") long value) { XrRenderModelBufferFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelBufferFB#bufferCapacityInput} field. */
        public XrRenderModelBufferFB.Buffer bufferCapacityInput(@NativeType("uint32_t") int value) { XrRenderModelBufferFB.nbufferCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelBufferFB#bufferCountOutput} field. */
        public XrRenderModelBufferFB.Buffer bufferCountOutput(@NativeType("uint32_t") int value) { XrRenderModelBufferFB.nbufferCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link XrRenderModelBufferFB#buffer} field. */
        public XrRenderModelBufferFB.Buffer buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { XrRenderModelBufferFB.nbuffer(address(), value); return this; }

    }

}