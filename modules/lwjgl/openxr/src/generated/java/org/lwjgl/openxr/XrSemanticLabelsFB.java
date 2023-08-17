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
 * Provides application with semantic usage of a spatial entity.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used by the {@link FBScene#xrGetSpaceSemanticLabelsFB GetSpaceSemanticLabelsFB} function to provide the application with the intended usage of the spatial entity.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using {@link XrSemanticLabelsFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBScene#XR_TYPE_SEMANTIC_LABELS_FB TYPE_SEMANTIC_LABELS_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBScene#xrGetSpaceSemanticLabelsFB GetSpaceSemanticLabelsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSemanticLabelsFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #bufferCapacityInput};
 *     uint32_t {@link #bufferCountOutput};
 *     char * {@link #buffer};
 * }</code></pre>
 */
public class XrSemanticLabelsFB extends Struct<XrSemanticLabelsFB> implements NativeResource {

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

    protected XrSemanticLabelsFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSemanticLabelsFB create(long address, @Nullable ByteBuffer container) {
        return new XrSemanticLabelsFB(address, container);
    }

    /**
     * Creates a {@code XrSemanticLabelsFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSemanticLabelsFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain, such as {@link XrSemanticLabelsSupportInfoFB}. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the capacity of the {@code buffer} array, in bytes, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int bufferCapacityInput() { return nbufferCapacityInput(address()); }
    /** the count of bytes written, or the required capacity in the case that {@code bufferCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int bufferCountOutput() { return nbufferCountOutput(address()); }
    /** a pointer to an array of bytes, but can be {@code NULL} if {@code bufferCapacityInput} is 0. Multiple labels represented by raw string, separated by a comma without spaces. */
    @Nullable
    @NativeType("char *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSemanticLabelsFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBScene#XR_TYPE_SEMANTIC_LABELS_FB TYPE_SEMANTIC_LABELS_FB} value to the {@link #type} field. */
    public XrSemanticLabelsFB type$Default() { return type(FBScene.XR_TYPE_SEMANTIC_LABELS_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSemanticLabelsFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferCapacityInput} field. */
    public XrSemanticLabelsFB bufferCapacityInput(@NativeType("uint32_t") int value) { nbufferCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferCountOutput} field. */
    public XrSemanticLabelsFB bufferCountOutput(@NativeType("uint32_t") int value) { nbufferCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #buffer} field. */
    public XrSemanticLabelsFB buffer(@Nullable @NativeType("char *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSemanticLabelsFB set(
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
    public XrSemanticLabelsFB set(XrSemanticLabelsFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSemanticLabelsFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSemanticLabelsFB malloc() {
        return new XrSemanticLabelsFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSemanticLabelsFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSemanticLabelsFB calloc() {
        return new XrSemanticLabelsFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSemanticLabelsFB} instance allocated with {@link BufferUtils}. */
    public static XrSemanticLabelsFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSemanticLabelsFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSemanticLabelsFB} instance for the specified memory address. */
    public static XrSemanticLabelsFB create(long address) {
        return new XrSemanticLabelsFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSemanticLabelsFB createSafe(long address) {
        return address == NULL ? null : new XrSemanticLabelsFB(address, null);
    }

    /**
     * Returns a new {@link XrSemanticLabelsFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSemanticLabelsFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSemanticLabelsFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSemanticLabelsFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSemanticLabelsFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSemanticLabelsFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSemanticLabelsFB malloc(MemoryStack stack) {
        return new XrSemanticLabelsFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSemanticLabelsFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSemanticLabelsFB calloc(MemoryStack stack) {
        return new XrSemanticLabelsFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSemanticLabelsFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSemanticLabelsFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSemanticLabelsFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSemanticLabelsFB.NEXT); }
    /** Unsafe version of {@link #bufferCapacityInput}. */
    public static int nbufferCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrSemanticLabelsFB.BUFFERCAPACITYINPUT); }
    /** Unsafe version of {@link #bufferCountOutput}. */
    public static int nbufferCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrSemanticLabelsFB.BUFFERCOUNTOUTPUT); }
    /** Unsafe version of {@link #buffer() buffer}. */
    @Nullable public static ByteBuffer nbuffer(long struct) { return memByteBufferSafe(memGetAddress(struct + XrSemanticLabelsFB.BUFFER), nbufferCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSemanticLabelsFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSemanticLabelsFB.NEXT, value); }
    /** Sets the specified value to the {@code bufferCapacityInput} field of the specified {@code struct}. */
    public static void nbufferCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrSemanticLabelsFB.BUFFERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #bufferCountOutput(int) bufferCountOutput}. */
    public static void nbufferCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrSemanticLabelsFB.BUFFERCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrSemanticLabelsFB.BUFFER, memAddressSafe(value)); if (value != null) { nbufferCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSemanticLabelsFB} structs. */
    public static class Buffer extends StructBuffer<XrSemanticLabelsFB, Buffer> implements NativeResource {

        private static final XrSemanticLabelsFB ELEMENT_FACTORY = XrSemanticLabelsFB.create(-1L);

        /**
         * Creates a new {@code XrSemanticLabelsFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSemanticLabelsFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSemanticLabelsFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSemanticLabelsFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSemanticLabelsFB.ntype(address()); }
        /** @return the value of the {@link XrSemanticLabelsFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSemanticLabelsFB.nnext(address()); }
        /** @return the value of the {@link XrSemanticLabelsFB#bufferCapacityInput} field. */
        @NativeType("uint32_t")
        public int bufferCapacityInput() { return XrSemanticLabelsFB.nbufferCapacityInput(address()); }
        /** @return the value of the {@link XrSemanticLabelsFB#bufferCountOutput} field. */
        @NativeType("uint32_t")
        public int bufferCountOutput() { return XrSemanticLabelsFB.nbufferCountOutput(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link XrSemanticLabelsFB#buffer} field. */
        @Nullable
        @NativeType("char *")
        public ByteBuffer buffer() { return XrSemanticLabelsFB.nbuffer(address()); }

        /** Sets the specified value to the {@link XrSemanticLabelsFB#type} field. */
        public XrSemanticLabelsFB.Buffer type(@NativeType("XrStructureType") int value) { XrSemanticLabelsFB.ntype(address(), value); return this; }
        /** Sets the {@link FBScene#XR_TYPE_SEMANTIC_LABELS_FB TYPE_SEMANTIC_LABELS_FB} value to the {@link XrSemanticLabelsFB#type} field. */
        public XrSemanticLabelsFB.Buffer type$Default() { return type(FBScene.XR_TYPE_SEMANTIC_LABELS_FB); }
        /** Sets the specified value to the {@link XrSemanticLabelsFB#next} field. */
        public XrSemanticLabelsFB.Buffer next(@NativeType("void const *") long value) { XrSemanticLabelsFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSemanticLabelsFB#bufferCapacityInput} field. */
        public XrSemanticLabelsFB.Buffer bufferCapacityInput(@NativeType("uint32_t") int value) { XrSemanticLabelsFB.nbufferCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrSemanticLabelsFB#bufferCountOutput} field. */
        public XrSemanticLabelsFB.Buffer bufferCountOutput(@NativeType("uint32_t") int value) { XrSemanticLabelsFB.nbufferCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link XrSemanticLabelsFB#buffer} field. */
        public XrSemanticLabelsFB.Buffer buffer(@Nullable @NativeType("char *") ByteBuffer value) { XrSemanticLabelsFB.nbuffer(address(), value); return this; }

    }

}