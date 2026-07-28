/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkCustomResolveCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 customResolve;
 *     uint32_t colorAttachmentCount;
 *     VkFormat const * pColorAttachmentFormats;
 *     VkFormat depthAttachmentFormat;
 *     VkFormat stencilAttachmentFormat;
 * }}</pre>
 */
public class VkCustomResolveCreateInfoEXT extends Struct<VkCustomResolveCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUSTOMRESOLVE,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTFORMATS,
        DEPTHATTACHMENTFORMAT,
        STENCILATTACHMENTFORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CUSTOMRESOLVE = layout.offsetof(2);
        COLORATTACHMENTCOUNT = layout.offsetof(3);
        PCOLORATTACHMENTFORMATS = layout.offsetof(4);
        DEPTHATTACHMENTFORMAT = layout.offsetof(5);
        STENCILATTACHMENTFORMAT = layout.offsetof(6);
    }

    protected VkCustomResolveCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCustomResolveCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCustomResolveCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCustomResolveCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCustomResolveCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code customResolve} field. */
    @NativeType("VkBool32")
    public boolean customResolve() { return ncustomResolve(address()) != 0; }
    /** @return the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentFormats} field. */
    @NativeType("VkFormat const *")
    public @Nullable IntBuffer pColorAttachmentFormats() { return npColorAttachmentFormats(address()); }
    /** @return the value of the {@code depthAttachmentFormat} field. */
    @NativeType("VkFormat")
    public int depthAttachmentFormat() { return ndepthAttachmentFormat(address()); }
    /** @return the value of the {@code stencilAttachmentFormat} field. */
    @NativeType("VkFormat")
    public int stencilAttachmentFormat() { return nstencilAttachmentFormat(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCustomResolveCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCustomResolve#VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkCustomResolveCreateInfoEXT sType$Default() { return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCustomResolveCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code customResolve} field. */
    public VkCustomResolveCreateInfoEXT customResolve(@NativeType("VkBool32") boolean value) { ncustomResolve(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkCustomResolveCreateInfoEXT colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
    public VkCustomResolveCreateInfoEXT pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@code depthAttachmentFormat} field. */
    public VkCustomResolveCreateInfoEXT depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
    public VkCustomResolveCreateInfoEXT stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCustomResolveCreateInfoEXT set(
        int sType,
        long pNext,
        boolean customResolve,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat
    ) {
        sType(sType);
        pNext(pNext);
        customResolve(customResolve);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCustomResolveCreateInfoEXT set(VkCustomResolveCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCustomResolveCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCustomResolveCreateInfoEXT malloc() {
        return new VkCustomResolveCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCustomResolveCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCustomResolveCreateInfoEXT calloc() {
        return new VkCustomResolveCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCustomResolveCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCustomResolveCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCustomResolveCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCustomResolveCreateInfoEXT} instance for the specified memory address. */
    public static VkCustomResolveCreateInfoEXT create(long address) {
        return new VkCustomResolveCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCustomResolveCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCustomResolveCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCustomResolveCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCustomResolveCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCustomResolveCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCustomResolveCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCustomResolveCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCustomResolveCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCustomResolveCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCustomResolveCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCustomResolveCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCustomResolveCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCustomResolveCreateInfoEXT malloc(MemoryStack stack) {
        return new VkCustomResolveCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCustomResolveCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCustomResolveCreateInfoEXT calloc(MemoryStack stack) {
        return new VkCustomResolveCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCustomResolveCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCustomResolveCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCustomResolveCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCustomResolveCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCustomResolveCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCustomResolveCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #customResolve}. */
    public static int ncustomResolve(long struct) { return memGetInt(struct + VkCustomResolveCreateInfoEXT.CUSTOMRESOLVE); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkCustomResolveCreateInfoEXT.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentFormats() pColorAttachmentFormats}. */
    public static @Nullable IntBuffer npColorAttachmentFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkCustomResolveCreateInfoEXT.PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthAttachmentFormat}. */
    public static int ndepthAttachmentFormat(long struct) { return memGetInt(struct + VkCustomResolveCreateInfoEXT.DEPTHATTACHMENTFORMAT); }
    /** Unsafe version of {@link #stencilAttachmentFormat}. */
    public static int nstencilAttachmentFormat(long struct) { return memGetInt(struct + VkCustomResolveCreateInfoEXT.STENCILATTACHMENTFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCustomResolveCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCustomResolveCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #customResolve(boolean) customResolve}. */
    public static void ncustomResolve(long struct, int value) { memPutInt(struct + VkCustomResolveCreateInfoEXT.CUSTOMRESOLVE, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkCustomResolveCreateInfoEXT.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentFormats(IntBuffer) pColorAttachmentFormats}. */
    public static void npColorAttachmentFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkCustomResolveCreateInfoEXT.PCOLORATTACHMENTFORMATS, memAddressSafe(value)); if (value != null) { ncolorAttachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #depthAttachmentFormat(int) depthAttachmentFormat}. */
    public static void ndepthAttachmentFormat(long struct, int value) { memPutInt(struct + VkCustomResolveCreateInfoEXT.DEPTHATTACHMENTFORMAT, value); }
    /** Unsafe version of {@link #stencilAttachmentFormat(int) stencilAttachmentFormat}. */
    public static void nstencilAttachmentFormat(long struct, int value) { memPutInt(struct + VkCustomResolveCreateInfoEXT.STENCILATTACHMENTFORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkCustomResolveCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCustomResolveCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkCustomResolveCreateInfoEXT ELEMENT_FACTORY = VkCustomResolveCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCustomResolveCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCustomResolveCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCustomResolveCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCustomResolveCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCustomResolveCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code customResolve} field. */
        @NativeType("VkBool32")
        public boolean customResolve() { return VkCustomResolveCreateInfoEXT.ncustomResolve(address()) != 0; }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkCustomResolveCreateInfoEXT.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentFormats} field. */
        @NativeType("VkFormat const *")
        public @Nullable IntBuffer pColorAttachmentFormats() { return VkCustomResolveCreateInfoEXT.npColorAttachmentFormats(address()); }
        /** @return the value of the {@code depthAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int depthAttachmentFormat() { return VkCustomResolveCreateInfoEXT.ndepthAttachmentFormat(address()); }
        /** @return the value of the {@code stencilAttachmentFormat} field. */
        @NativeType("VkFormat")
        public int stencilAttachmentFormat() { return VkCustomResolveCreateInfoEXT.nstencilAttachmentFormat(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCustomResolveCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCustomResolveCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCustomResolve#VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkCustomResolveCreateInfoEXT.Buffer sType$Default() { return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCustomResolveCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCustomResolveCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code customResolve} field. */
        public VkCustomResolveCreateInfoEXT.Buffer customResolve(@NativeType("VkBool32") boolean value) { VkCustomResolveCreateInfoEXT.ncustomResolve(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkCustomResolveCreateInfoEXT.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkCustomResolveCreateInfoEXT.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
        public VkCustomResolveCreateInfoEXT.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkCustomResolveCreateInfoEXT.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@code depthAttachmentFormat} field. */
        public VkCustomResolveCreateInfoEXT.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkCustomResolveCreateInfoEXT.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
        public VkCustomResolveCreateInfoEXT.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkCustomResolveCreateInfoEXT.nstencilAttachmentFormat(address(), value); return this; }

    }

}