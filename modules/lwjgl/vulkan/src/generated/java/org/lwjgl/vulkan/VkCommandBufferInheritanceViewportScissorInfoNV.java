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
 * Structure specifying command buffer inheritance information.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkCommandBufferInheritanceInfo} includes a {@link VkCommandBufferInheritanceViewportScissorInfoNV} structure, then that structure controls whether a command buffer <b>can</b> inherit the following state from other command buffers:</p>
 * 
 * <ul>
 * <li>{@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR}</li>
 * <li>{@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT}</li>
 * <li>{@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT}</li>
 * </ul>
 * 
 * <p>as well as the following state, with restrictions on inherited depth values and viewport count:</p>
 * 
 * <ul>
 * <li>{@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT}</li>
 * <li>{@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT}</li>
 * </ul>
 * 
 * <p>If {@code viewportScissor2D} is {@link VK10#VK_FALSE FALSE}, then the command buffer does not inherit the listed dynamic state, and <b>should</b> set this state itself. If this structure is not present, the behavior is as if {@code viewportScissor2D} is {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <p>If {@code viewportScissor2D} is {@link VK10#VK_TRUE TRUE}, then the listed dynamic state is inherited, and the command buffer <b>must</b> not set this state, except that the viewport and scissor count <b>may</b> be set by binding a graphics pipeline that does not specify this state as dynamic.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Due to this restriction, applications <b>should</b> ensure either all or none of the graphics pipelines bound in this secondary command buffer use dynamic viewport/scissor counts.</p>
 * </div>
 * 
 * <p>When the command buffer is executed as part of a the execution of a {@link VK10#vkCmdExecuteCommands CmdExecuteCommands} command, the inherited state (if enabled) is determined by the following procedure, performed separately for each dynamic state, and separately for each value for dynamic state that consists of multiple values (e.g. multiple viewports).</p>
 * 
 * <ul>
 * <li>With <code>i</code> being the index of the executed command buffer in the {@code pCommandBuffers} array of {@link VK10#vkCmdExecuteCommands CmdExecuteCommands}, if <code>i &gt; 0</code> and any secondary command buffer from index <code>0</code> to <code>i-1</code> modifies the state, the inherited state is provisionally set to the final value set by the last such secondary command buffer. Binding a graphics pipeline defining the state statically is equivalent to setting the state to an undefined value.</li>
 * <li>Otherwise, the tentatative inherited state is that of the primary command buffer at the point the {@link VK10#vkCmdExecuteCommands CmdExecuteCommands} command was recorded; if the state is undefined, then so is the provisional inherited state.</li>
 * <li>If the provisional inherited state is an undefined value, then the state is not inherited.</li>
 * <li>If the provisional inherited state is a viewport, with <code>n</code> being its viewport index, then if <code>n ≥ viewportDepthCount</code>, or if either {@link VkViewport}{@code ::minDepth} or {@link VkViewport}{@code ::maxDepth} are not equal to the respective values of the <code>n<sup>th</sup></code> element of {@code pViewportDepths}, then the state is not inherited.</li>
 * <li>If the provisional inherited state passes both checks, then it becomes the actual inherited state.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There is no support for inheriting dynamic state from a secondary command buffer executed as part of a different {@code vkCmdExecuteCommands} command.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-inheritedViewportScissor2D">inherited viewport scissor</a> feature is not enabled, {@code viewportScissor2D} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled and {@code viewportScissor2D} is {@link VK10#VK_TRUE TRUE}, then {@code viewportDepthCount} <b>must</b> be 1</li>
 * <li>If {@code viewportScissor2D} is {@link VK10#VK_TRUE TRUE}, then {@code viewportDepthCount} <b>must</b> be greater than 0</li>
 * <li>If {@code viewportScissor2D} is {@link VK10#VK_TRUE TRUE}, then {@code pViewportDepths} <b>must</b> be a valid pointer to an array of {@code viewportDepthCount} valid {@link VkViewport} structures, except any requirements on {@code x}, {@code y}, {@code width}, and {@code height} do not apply</li>
 * <li>If {@code viewportScissor2D} is {@link VK10#VK_TRUE TRUE}, then the command buffer <b>must</b> be recorded with the {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVInheritedViewportScissor#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkViewport}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceViewportScissorInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #viewportScissor2D};
 *     uint32_t {@link #viewportDepthCount};
 *     {@link VkViewport VkViewport} const * {@link #pViewportDepths};
 * }</code></pre>
 */
public class VkCommandBufferInheritanceViewportScissorInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIEWPORTSCISSOR2D,
        VIEWPORTDEPTHCOUNT,
        PVIEWPORTDEPTHS;

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

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWPORTSCISSOR2D = layout.offsetof(2);
        VIEWPORTDEPTHCOUNT = layout.offsetof(3);
        PVIEWPORTDEPTHS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceViewportScissorInfoNV(ByteBuffer container) {
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
    /** specifies whether the listed dynamic state is inherited. */
    @NativeType("VkBool32")
    public boolean viewportScissor2D() { return nviewportScissor2D(address()) != 0; }
    /** specifies the maximum number of viewports to inherit. When {@code viewportScissor2D} is {@link VK10#VK_FALSE FALSE}, the behavior is as if this value is zero. */
    @NativeType("uint32_t")
    public int viewportDepthCount() { return nviewportDepthCount(address()); }
    /** a pointer to a {@link VkViewport} structure specifying the expected depth range for each inherited viewport. */
    @Nullable
    @NativeType("VkViewport const *")
    public VkViewport pViewportDepths() { return npViewportDepths(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVInheritedViewportScissor#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV} value to the {@link #sType} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV sType$Default() { return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #viewportScissor2D} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2D(@NativeType("VkBool32") boolean value) { nviewportScissor2D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #viewportDepthCount} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCount(@NativeType("uint32_t") int value) { nviewportDepthCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkViewport} to the {@link #pViewportDepths} field. */
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepths(@Nullable @NativeType("VkViewport const *") VkViewport value) { npViewportDepths(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceViewportScissorInfoNV set(
        int sType,
        long pNext,
        boolean viewportScissor2D,
        int viewportDepthCount,
        @Nullable VkViewport pViewportDepths
    ) {
        sType(sType);
        pNext(pNext);
        viewportScissor2D(viewportScissor2D);
        viewportDepthCount(viewportDepthCount);
        pViewportDepths(pViewportDepths);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceViewportScissorInfoNV set(VkCommandBufferInheritanceViewportScissorInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV malloc() {
        return wrap(VkCommandBufferInheritanceViewportScissorInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV calloc() {
        return wrap(VkCommandBufferInheritanceViewportScissorInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferInheritanceViewportScissorInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance for the specified memory address. */
    public static VkCommandBufferInheritanceViewportScissorInfoNV create(long address) {
        return wrap(VkCommandBufferInheritanceViewportScissorInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceViewportScissorInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferInheritanceViewportScissorInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV malloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceViewportScissorInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceViewportScissorInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV calloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceViewportScissorInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceViewportScissorInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceViewportScissorInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PNEXT); }
    /** Unsafe version of {@link #viewportScissor2D}. */
    public static int nviewportScissor2D(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTSCISSOR2D); }
    /** Unsafe version of {@link #viewportDepthCount}. */
    public static int nviewportDepthCount(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTDEPTHCOUNT); }
    /** Unsafe version of {@link #pViewportDepths}. */
    @Nullable public static VkViewport npViewportDepths(long struct) { return VkViewport.createSafe(memGetAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PVIEWPORTDEPTHS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceViewportScissorInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #viewportScissor2D(boolean) viewportScissor2D}. */
    public static void nviewportScissor2D(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTSCISSOR2D, value); }
    /** Unsafe version of {@link #viewportDepthCount(int) viewportDepthCount}. */
    public static void nviewportDepthCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceViewportScissorInfoNV.VIEWPORTDEPTHCOUNT, value); }
    /** Unsafe version of {@link #pViewportDepths(VkViewport) pViewportDepths}. */
    public static void npViewportDepths(long struct, @Nullable VkViewport value) { memPutAddress(struct + VkCommandBufferInheritanceViewportScissorInfoNV.PVIEWPORTDEPTHS, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceViewportScissorInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceViewportScissorInfoNV, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceViewportScissorInfoNV ELEMENT_FACTORY = VkCommandBufferInheritanceViewportScissorInfoNV.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceViewportScissorInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceViewportScissorInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferInheritanceViewportScissorInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferInheritanceViewportScissorInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceViewportScissorInfoNV.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceViewportScissorInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceViewportScissorInfoNV.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceViewportScissorInfoNV#viewportScissor2D} field. */
        @NativeType("VkBool32")
        public boolean viewportScissor2D() { return VkCommandBufferInheritanceViewportScissorInfoNV.nviewportScissor2D(address()) != 0; }
        /** @return the value of the {@link VkCommandBufferInheritanceViewportScissorInfoNV#viewportDepthCount} field. */
        @NativeType("uint32_t")
        public int viewportDepthCount() { return VkCommandBufferInheritanceViewportScissorInfoNV.nviewportDepthCount(address()); }
        /** @return a {@link VkViewport} view of the struct pointed to by the {@link VkCommandBufferInheritanceViewportScissorInfoNV#pViewportDepths} field. */
        @Nullable
        @NativeType("VkViewport const *")
        public VkViewport pViewportDepths() { return VkCommandBufferInheritanceViewportScissorInfoNV.npViewportDepths(address()); }

        /** Sets the specified value to the {@link VkCommandBufferInheritanceViewportScissorInfoNV#sType} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVInheritedViewportScissor#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV} value to the {@link VkCommandBufferInheritanceViewportScissorInfoNV#sType} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer sType$Default() { return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV); }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceViewportScissorInfoNV#pNext} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceViewportScissorInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceViewportScissorInfoNV#viewportScissor2D} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer viewportScissor2D(@NativeType("VkBool32") boolean value) { VkCommandBufferInheritanceViewportScissorInfoNV.nviewportScissor2D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceViewportScissorInfoNV#viewportDepthCount} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer viewportDepthCount(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.nviewportDepthCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkViewport} to the {@link VkCommandBufferInheritanceViewportScissorInfoNV#pViewportDepths} field. */
        public VkCommandBufferInheritanceViewportScissorInfoNV.Buffer pViewportDepths(@Nullable @NativeType("VkViewport const *") VkViewport value) { VkCommandBufferInheritanceViewportScissorInfoNV.npViewportDepths(address(), value); return this; }

    }

}