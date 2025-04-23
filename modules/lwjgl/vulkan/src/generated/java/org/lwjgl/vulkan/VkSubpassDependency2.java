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
 * struct VkSubpassDependency2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t srcSubpass;
 *     uint32_t dstSubpass;
 *     VkPipelineStageFlags srcStageMask;
 *     VkPipelineStageFlags dstStageMask;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkDependencyFlags dependencyFlags;
 *     int32_t viewOffset;
 * }}</pre>
 */
public class VkSubpassDependency2 extends Struct<VkSubpassDependency2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSUBPASS,
        DSTSUBPASS,
        SRCSTAGEMASK,
        DSTSTAGEMASK,
        SRCACCESSMASK,
        DSTACCESSMASK,
        DEPENDENCYFLAGS,
        VIEWOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBPASS = layout.offsetof(2);
        DSTSUBPASS = layout.offsetof(3);
        SRCSTAGEMASK = layout.offsetof(4);
        DSTSTAGEMASK = layout.offsetof(5);
        SRCACCESSMASK = layout.offsetof(6);
        DSTACCESSMASK = layout.offsetof(7);
        DEPENDENCYFLAGS = layout.offsetof(8);
        VIEWOFFSET = layout.offsetof(9);
    }

    protected VkSubpassDependency2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassDependency2 create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassDependency2(address, container);
    }

    /**
     * Creates a {@code VkSubpassDependency2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDependency2(ByteBuffer container) {
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
    /** @return the value of the {@code srcSubpass} field. */
    @NativeType("uint32_t")
    public int srcSubpass() { return nsrcSubpass(address()); }
    /** @return the value of the {@code dstSubpass} field. */
    @NativeType("uint32_t")
    public int dstSubpass() { return ndstSubpass(address()); }
    /** @return the value of the {@code srcStageMask} field. */
    @NativeType("VkPipelineStageFlags")
    public int srcStageMask() { return nsrcStageMask(address()); }
    /** @return the value of the {@code dstStageMask} field. */
    @NativeType("VkPipelineStageFlags")
    public int dstStageMask() { return ndstStageMask(address()); }
    /** @return the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** @return the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }
    /** @return the value of the {@code dependencyFlags} field. */
    @NativeType("VkDependencyFlags")
    public int dependencyFlags() { return ndependencyFlags(address()); }
    /** @return the value of the {@code viewOffset} field. */
    @NativeType("int32_t")
    public int viewOffset() { return nviewOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassDependency2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2} value to the {@code sType} field. */
    public VkSubpassDependency2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassDependency2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkMemoryBarrier2} value to the {@code pNext} chain. */
    public VkSubpassDependency2 pNext(VkMemoryBarrier2 value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryBarrier2KHR} value to the {@code pNext} chain. */
    public VkSubpassDependency2 pNext(VkMemoryBarrier2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryBarrierAccessFlags3KHR} value to the {@code pNext} chain. */
    public VkSubpassDependency2 pNext(VkMemoryBarrierAccessFlags3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code srcSubpass} field. */
    public VkSubpassDependency2 srcSubpass(@NativeType("uint32_t") int value) { nsrcSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code dstSubpass} field. */
    public VkSubpassDependency2 dstSubpass(@NativeType("uint32_t") int value) { ndstSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code srcStageMask} field. */
    public VkSubpassDependency2 srcStageMask(@NativeType("VkPipelineStageFlags") int value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    public VkSubpassDependency2 dstStageMask(@NativeType("VkPipelineStageFlags") int value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkSubpassDependency2 srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkSubpassDependency2 dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dependencyFlags} field. */
    public VkSubpassDependency2 dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the specified value to the {@code viewOffset} field. */
    public VkSubpassDependency2 viewOffset(@NativeType("int32_t") int value) { nviewOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDependency2 set(
        int sType,
        long pNext,
        int srcSubpass,
        int dstSubpass,
        int srcStageMask,
        int dstStageMask,
        int srcAccessMask,
        int dstAccessMask,
        int dependencyFlags,
        int viewOffset
    ) {
        sType(sType);
        pNext(pNext);
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);
        viewOffset(viewOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDependency2 set(VkSubpassDependency2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDependency2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2 malloc() {
        return new VkSubpassDependency2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDependency2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2 calloc() {
        return new VkSubpassDependency2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDependency2} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDependency2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDependency2(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDependency2} instance for the specified memory address. */
    public static VkSubpassDependency2 create(long address) {
        return new VkSubpassDependency2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassDependency2 createSafe(long address) {
        return address == NULL ? null : new VkSubpassDependency2(address, null);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassDependency2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassDependency2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassDependency2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2 malloc(MemoryStack stack) {
        return new VkSubpassDependency2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassDependency2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2 calloc(MemoryStack stack) {
        return new VkSubpassDependency2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassDependency2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDependency2.PNEXT); }
    /** Unsafe version of {@link #srcSubpass}. */
    public static int nsrcSubpass(long struct) { return memGetInt(struct + VkSubpassDependency2.SRCSUBPASS); }
    /** Unsafe version of {@link #dstSubpass}. */
    public static int ndstSubpass(long struct) { return memGetInt(struct + VkSubpassDependency2.DSTSUBPASS); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static int nsrcStageMask(long struct) { return memGetInt(struct + VkSubpassDependency2.SRCSTAGEMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static int ndstStageMask(long struct) { return memGetInt(struct + VkSubpassDependency2.DSTSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency2.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency2.DSTACCESSMASK); }
    /** Unsafe version of {@link #dependencyFlags}. */
    public static int ndependencyFlags(long struct) { return memGetInt(struct + VkSubpassDependency2.DEPENDENCYFLAGS); }
    /** Unsafe version of {@link #viewOffset}. */
    public static int nviewOffset(long struct) { return memGetInt(struct + VkSubpassDependency2.VIEWOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassDependency2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDependency2.PNEXT, value); }
    /** Unsafe version of {@link #srcSubpass(int) srcSubpass}. */
    public static void nsrcSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency2.SRCSUBPASS, value); }
    /** Unsafe version of {@link #dstSubpass(int) dstSubpass}. */
    public static void ndstSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency2.DSTSUBPASS, value); }
    /** Unsafe version of {@link #srcStageMask(int) srcStageMask}. */
    public static void nsrcStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #dstStageMask(int) dstStageMask}. */
    public static void ndstStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
    public static void ndependencyFlags(long struct, int value) { memPutInt(struct + VkSubpassDependency2.DEPENDENCYFLAGS, value); }
    /** Unsafe version of {@link #viewOffset(int) viewOffset}. */
    public static void nviewOffset(long struct, int value) { memPutInt(struct + VkSubpassDependency2.VIEWOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassDependency2} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDependency2, Buffer> implements NativeResource {

        private static final VkSubpassDependency2 ELEMENT_FACTORY = VkSubpassDependency2.create(-1L);

        /**
         * Creates a new {@code VkSubpassDependency2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDependency2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassDependency2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDependency2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDependency2.npNext(address()); }
        /** @return the value of the {@code srcSubpass} field. */
        @NativeType("uint32_t")
        public int srcSubpass() { return VkSubpassDependency2.nsrcSubpass(address()); }
        /** @return the value of the {@code dstSubpass} field. */
        @NativeType("uint32_t")
        public int dstSubpass() { return VkSubpassDependency2.ndstSubpass(address()); }
        /** @return the value of the {@code srcStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int srcStageMask() { return VkSubpassDependency2.nsrcStageMask(address()); }
        /** @return the value of the {@code dstStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int dstStageMask() { return VkSubpassDependency2.ndstStageMask(address()); }
        /** @return the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkSubpassDependency2.nsrcAccessMask(address()); }
        /** @return the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkSubpassDependency2.ndstAccessMask(address()); }
        /** @return the value of the {@code dependencyFlags} field. */
        @NativeType("VkDependencyFlags")
        public int dependencyFlags() { return VkSubpassDependency2.ndependencyFlags(address()); }
        /** @return the value of the {@code viewOffset} field. */
        @NativeType("int32_t")
        public int viewOffset() { return VkSubpassDependency2.nviewOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassDependency2.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDependency2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2} value to the {@code sType} field. */
        public VkSubpassDependency2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassDependency2.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDependency2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkMemoryBarrier2} value to the {@code pNext} chain. */
        public VkSubpassDependency2.Buffer pNext(VkMemoryBarrier2 value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryBarrier2KHR} value to the {@code pNext} chain. */
        public VkSubpassDependency2.Buffer pNext(VkMemoryBarrier2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryBarrierAccessFlags3KHR} value to the {@code pNext} chain. */
        public VkSubpassDependency2.Buffer pNext(VkMemoryBarrierAccessFlags3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code srcSubpass} field. */
        public VkSubpassDependency2.Buffer srcSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2.nsrcSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code dstSubpass} field. */
        public VkSubpassDependency2.Buffer dstSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2.ndstSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code srcStageMask} field. */
        public VkSubpassDependency2.Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        public VkSubpassDependency2.Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkSubpassDependency2.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkSubpassDependency2.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dependencyFlags} field. */
        public VkSubpassDependency2.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkSubpassDependency2.ndependencyFlags(address(), value); return this; }
        /** Sets the specified value to the {@code viewOffset} field. */
        public VkSubpassDependency2.Buffer viewOffset(@NativeType("int32_t") int value) { VkSubpassDependency2.nviewOffset(address(), value); return this; }

    }

}