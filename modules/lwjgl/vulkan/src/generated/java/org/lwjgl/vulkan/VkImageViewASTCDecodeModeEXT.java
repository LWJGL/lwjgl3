/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the ASTC decode mode for an image view.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code decodeMode} <b>must</b> be one of {@link VK10#VK_FORMAT_R16G16B16A16_SFLOAT FORMAT_R16G16B16A16_SFLOAT}, {@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM}, or {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-astc-decodeModeSharedExponent">{@code decodeModeSharedExponent}</a> feature is not enabled, {@code decodeMode} <b>must</b> not be {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}</li>
 * <li>If {@code decodeMode} is {@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} the image view <b>must</b> not include blocks using any of the ASTC HDR modes</li>
 * <li>{@code format} of the image view <b>must</b> be one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#appendix-compressedtex-astc">ASTC Compressed Image Formats</a></li>
 * </ul>
 * 
 * <p>If {@code format} uses sRGB encoding then the {@code decodeMode} has no effect.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTAstcDecodeMode#VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT}</li>
 * <li>{@code decodeMode} <b>must</b> be a valid {@code VkFormat} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewASTCDecodeModeEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFormat {@link #decodeMode};
 * }</code></pre>
 */
public class VkImageViewASTCDecodeModeEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DECODEMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DECODEMODE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageViewASTCDecodeModeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewASTCDecodeModeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the intermediate format used to decode ASTC compressed formats. */
    @NativeType("VkFormat")
    public int decodeMode() { return ndecodeMode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageViewASTCDecodeModeEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTAstcDecodeMode#VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT} value to the {@link #sType} field. */
    public VkImageViewASTCDecodeModeEXT sType$Default() { return sType(EXTAstcDecodeMode.VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageViewASTCDecodeModeEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #decodeMode} field. */
    public VkImageViewASTCDecodeModeEXT decodeMode(@NativeType("VkFormat") int value) { ndecodeMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewASTCDecodeModeEXT set(
        int sType,
        long pNext,
        int decodeMode
    ) {
        sType(sType);
        pNext(pNext);
        decodeMode(decodeMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewASTCDecodeModeEXT set(VkImageViewASTCDecodeModeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewASTCDecodeModeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewASTCDecodeModeEXT malloc() {
        return wrap(VkImageViewASTCDecodeModeEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageViewASTCDecodeModeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewASTCDecodeModeEXT calloc() {
        return wrap(VkImageViewASTCDecodeModeEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageViewASTCDecodeModeEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageViewASTCDecodeModeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageViewASTCDecodeModeEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewASTCDecodeModeEXT} instance for the specified memory address. */
    public static VkImageViewASTCDecodeModeEXT create(long address) {
        return wrap(VkImageViewASTCDecodeModeEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewASTCDecodeModeEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImageViewASTCDecodeModeEXT.class, address);
    }

    /**
     * Returns a new {@link VkImageViewASTCDecodeModeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewASTCDecodeModeEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewASTCDecodeModeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewASTCDecodeModeEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewASTCDecodeModeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewASTCDecodeModeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageViewASTCDecodeModeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewASTCDecodeModeEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewASTCDecodeModeEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewASTCDecodeModeEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageViewASTCDecodeModeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewASTCDecodeModeEXT malloc(MemoryStack stack) {
        return wrap(VkImageViewASTCDecodeModeEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageViewASTCDecodeModeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewASTCDecodeModeEXT calloc(MemoryStack stack) {
        return wrap(VkImageViewASTCDecodeModeEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewASTCDecodeModeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewASTCDecodeModeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewASTCDecodeModeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewASTCDecodeModeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewASTCDecodeModeEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewASTCDecodeModeEXT.PNEXT); }
    /** Unsafe version of {@link #decodeMode}. */
    public static int ndecodeMode(long struct) { return UNSAFE.getInt(null, struct + VkImageViewASTCDecodeModeEXT.DECODEMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewASTCDecodeModeEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewASTCDecodeModeEXT.PNEXT, value); }
    /** Unsafe version of {@link #decodeMode(int) decodeMode}. */
    public static void ndecodeMode(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewASTCDecodeModeEXT.DECODEMODE, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewASTCDecodeModeEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageViewASTCDecodeModeEXT, Buffer> implements NativeResource {

        private static final VkImageViewASTCDecodeModeEXT ELEMENT_FACTORY = VkImageViewASTCDecodeModeEXT.create(-1L);

        /**
         * Creates a new {@code VkImageViewASTCDecodeModeEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewASTCDecodeModeEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImageViewASTCDecodeModeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageViewASTCDecodeModeEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewASTCDecodeModeEXT.nsType(address()); }
        /** @return the value of the {@link VkImageViewASTCDecodeModeEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewASTCDecodeModeEXT.npNext(address()); }
        /** @return the value of the {@link VkImageViewASTCDecodeModeEXT#decodeMode} field. */
        @NativeType("VkFormat")
        public int decodeMode() { return VkImageViewASTCDecodeModeEXT.ndecodeMode(address()); }

        /** Sets the specified value to the {@link VkImageViewASTCDecodeModeEXT#sType} field. */
        public VkImageViewASTCDecodeModeEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewASTCDecodeModeEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTAstcDecodeMode#VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT} value to the {@link VkImageViewASTCDecodeModeEXT#sType} field. */
        public VkImageViewASTCDecodeModeEXT.Buffer sType$Default() { return sType(EXTAstcDecodeMode.VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT); }
        /** Sets the specified value to the {@link VkImageViewASTCDecodeModeEXT#pNext} field. */
        public VkImageViewASTCDecodeModeEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageViewASTCDecodeModeEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewASTCDecodeModeEXT#decodeMode} field. */
        public VkImageViewASTCDecodeModeEXT.Buffer decodeMode(@NativeType("VkFormat") int value) { VkImageViewASTCDecodeModeEXT.ndecodeMode(address(), value); return this; }

    }

}