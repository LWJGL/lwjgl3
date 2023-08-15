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
 * Virtual keyboard texture data.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrVirtualKeyboardTextureDataMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} {@code uint8_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAVirtualKeyboard#xrGetVirtualKeyboardTextureDataMETA GetVirtualKeyboardTextureDataMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVirtualKeyboardTextureDataMETA {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #textureWidth};
 *     uint32_t {@link #textureHeight};
 *     uint32_t {@link #bufferCapacityInput};
 *     uint32_t {@link #bufferCountOutput};
 *     uint8_t * {@link #buffer};
 * }</code></pre>
 */
public class XrVirtualKeyboardTextureDataMETA extends Struct<XrVirtualKeyboardTextureDataMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TEXTUREWIDTH,
        TEXTUREHEIGHT,
        BUFFERCAPACITYINPUT,
        BUFFERCOUNTOUTPUT,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TEXTUREWIDTH = layout.offsetof(2);
        TEXTUREHEIGHT = layout.offsetof(3);
        BUFFERCAPACITYINPUT = layout.offsetof(4);
        BUFFERCOUNTOUTPUT = layout.offsetof(5);
        BUFFER = layout.offsetof(6);
    }

    protected XrVirtualKeyboardTextureDataMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardTextureDataMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardTextureDataMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardTextureDataMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardTextureDataMETA(ByteBuffer container) {
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
    /** the pixel width of the texture to be updated. */
    @NativeType("uint32_t")
    public int textureWidth() { return ntextureWidth(address()); }
    /** the pixel height of the texture to be updated. */
    @NativeType("uint32_t")
    public int textureHeight() { return ntextureHeight(address()); }
    /** the capacity of {@code buffer}, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int bufferCapacityInput() { return nbufferCapacityInput(address()); }
    /** filled in by the runtime with the byte count written or the required capacity in the case that {@code bufferCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int bufferCountOutput() { return nbufferCountOutput(address()); }
    /** the pixel data in linear color space, RGBA 8-bit unsigned normalized integer format (i.e. GL_RGBA8 in OpenGL, VK_FORMAT_R8G8B8A8_UNORM in Vulkan). */
    @Nullable
    @NativeType("uint8_t *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVirtualKeyboardTextureDataMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META} value to the {@link #type} field. */
    public XrVirtualKeyboardTextureDataMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVirtualKeyboardTextureDataMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #textureWidth} field. */
    public XrVirtualKeyboardTextureDataMETA textureWidth(@NativeType("uint32_t") int value) { ntextureWidth(address(), value); return this; }
    /** Sets the specified value to the {@link #textureHeight} field. */
    public XrVirtualKeyboardTextureDataMETA textureHeight(@NativeType("uint32_t") int value) { ntextureHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferCapacityInput} field. */
    public XrVirtualKeyboardTextureDataMETA bufferCapacityInput(@NativeType("uint32_t") int value) { nbufferCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferCountOutput} field. */
    public XrVirtualKeyboardTextureDataMETA bufferCountOutput(@NativeType("uint32_t") int value) { nbufferCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #buffer} field. */
    public XrVirtualKeyboardTextureDataMETA buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardTextureDataMETA set(
        int type,
        long next,
        int textureWidth,
        int textureHeight,
        int bufferCapacityInput,
        int bufferCountOutput,
        @Nullable ByteBuffer buffer
    ) {
        type(type);
        next(next);
        textureWidth(textureWidth);
        textureHeight(textureHeight);
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
    public XrVirtualKeyboardTextureDataMETA set(XrVirtualKeyboardTextureDataMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardTextureDataMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardTextureDataMETA malloc() {
        return new XrVirtualKeyboardTextureDataMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardTextureDataMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardTextureDataMETA calloc() {
        return new XrVirtualKeyboardTextureDataMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardTextureDataMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardTextureDataMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardTextureDataMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardTextureDataMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardTextureDataMETA create(long address) {
        return new XrVirtualKeyboardTextureDataMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardTextureDataMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardTextureDataMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextureDataMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextureDataMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextureDataMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextureDataMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextureDataMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextureDataMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardTextureDataMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextureDataMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardTextureDataMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardTextureDataMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardTextureDataMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardTextureDataMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardTextureDataMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardTextureDataMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardTextureDataMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextureDataMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextureDataMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextureDataMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextureDataMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardTextureDataMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardTextureDataMETA.NEXT); }
    /** Unsafe version of {@link #textureWidth}. */
    public static int ntextureWidth(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardTextureDataMETA.TEXTUREWIDTH); }
    /** Unsafe version of {@link #textureHeight}. */
    public static int ntextureHeight(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardTextureDataMETA.TEXTUREHEIGHT); }
    /** Unsafe version of {@link #bufferCapacityInput}. */
    public static int nbufferCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardTextureDataMETA.BUFFERCAPACITYINPUT); }
    /** Unsafe version of {@link #bufferCountOutput}. */
    public static int nbufferCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardTextureDataMETA.BUFFERCOUNTOUTPUT); }
    /** Unsafe version of {@link #buffer() buffer}. */
    @Nullable public static ByteBuffer nbuffer(long struct) { return memByteBufferSafe(memGetAddress(struct + XrVirtualKeyboardTextureDataMETA.BUFFER), nbufferCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardTextureDataMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardTextureDataMETA.NEXT, value); }
    /** Unsafe version of {@link #textureWidth(int) textureWidth}. */
    public static void ntextureWidth(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardTextureDataMETA.TEXTUREWIDTH, value); }
    /** Unsafe version of {@link #textureHeight(int) textureHeight}. */
    public static void ntextureHeight(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardTextureDataMETA.TEXTUREHEIGHT, value); }
    /** Sets the specified value to the {@code bufferCapacityInput} field of the specified {@code struct}. */
    public static void nbufferCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardTextureDataMETA.BUFFERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #bufferCountOutput(int) bufferCountOutput}. */
    public static void nbufferCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardTextureDataMETA.BUFFERCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrVirtualKeyboardTextureDataMETA.BUFFER, memAddressSafe(value)); if (value != null) { nbufferCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardTextureDataMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardTextureDataMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardTextureDataMETA ELEMENT_FACTORY = XrVirtualKeyboardTextureDataMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardTextureDataMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardTextureDataMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardTextureDataMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVirtualKeyboardTextureDataMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardTextureDataMETA.ntype(address()); }
        /** @return the value of the {@link XrVirtualKeyboardTextureDataMETA#next} field. */
        @NativeType("void *")
        public long next() { return XrVirtualKeyboardTextureDataMETA.nnext(address()); }
        /** @return the value of the {@link XrVirtualKeyboardTextureDataMETA#textureWidth} field. */
        @NativeType("uint32_t")
        public int textureWidth() { return XrVirtualKeyboardTextureDataMETA.ntextureWidth(address()); }
        /** @return the value of the {@link XrVirtualKeyboardTextureDataMETA#textureHeight} field. */
        @NativeType("uint32_t")
        public int textureHeight() { return XrVirtualKeyboardTextureDataMETA.ntextureHeight(address()); }
        /** @return the value of the {@link XrVirtualKeyboardTextureDataMETA#bufferCapacityInput} field. */
        @NativeType("uint32_t")
        public int bufferCapacityInput() { return XrVirtualKeyboardTextureDataMETA.nbufferCapacityInput(address()); }
        /** @return the value of the {@link XrVirtualKeyboardTextureDataMETA#bufferCountOutput} field. */
        @NativeType("uint32_t")
        public int bufferCountOutput() { return XrVirtualKeyboardTextureDataMETA.nbufferCountOutput(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link XrVirtualKeyboardTextureDataMETA#buffer} field. */
        @Nullable
        @NativeType("uint8_t *")
        public ByteBuffer buffer() { return XrVirtualKeyboardTextureDataMETA.nbuffer(address()); }

        /** Sets the specified value to the {@link XrVirtualKeyboardTextureDataMETA#type} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardTextureDataMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META} value to the {@link XrVirtualKeyboardTextureDataMETA#type} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META); }
        /** Sets the specified value to the {@link XrVirtualKeyboardTextureDataMETA#next} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer next(@NativeType("void *") long value) { XrVirtualKeyboardTextureDataMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardTextureDataMETA#textureWidth} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer textureWidth(@NativeType("uint32_t") int value) { XrVirtualKeyboardTextureDataMETA.ntextureWidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardTextureDataMETA#textureHeight} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer textureHeight(@NativeType("uint32_t") int value) { XrVirtualKeyboardTextureDataMETA.ntextureHeight(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardTextureDataMETA#bufferCapacityInput} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer bufferCapacityInput(@NativeType("uint32_t") int value) { XrVirtualKeyboardTextureDataMETA.nbufferCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardTextureDataMETA#bufferCountOutput} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer bufferCountOutput(@NativeType("uint32_t") int value) { XrVirtualKeyboardTextureDataMETA.nbufferCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link XrVirtualKeyboardTextureDataMETA#buffer} field. */
        public XrVirtualKeyboardTextureDataMETA.Buffer buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { XrVirtualKeyboardTextureDataMETA.nbuffer(address(), value); return this; }

    }

}