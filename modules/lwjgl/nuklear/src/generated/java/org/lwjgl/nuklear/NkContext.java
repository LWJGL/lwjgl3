/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_context {
 *     {@link NkInput struct nk_input} input;
 *     {@link NkStyle struct nk_style} style;
 *     {@link NkBuffer struct nk_buffer} memory;
 *     {@link NkClipboard struct nk_clipboard} clip;
 *     nk_flags last_widget_state;
 *     enum nk_button_behavior button_behavior;
 *     {@link NkConfigurationStacks struct nk_configuration_stacks} stacks;
 *     float delta_time_seconds;
 *     {@link NkDrawList struct nk_draw_list} draw_list;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkTextEdit struct nk_text_edit} text_edit;
 *     {@link NkCommandBuffer struct nk_command_buffer} overlay;
 *     int build;
 *     int use_pool;
 *     {@link NkPool struct nk_pool} pool;
 *     {@link NkWindow struct nk_window} * begin;
 *     {@link NkWindow struct nk_window} * end;
 *     {@link NkWindow struct nk_window} * active;
 *     {@link NkWindow struct nk_window} * current;
 *     struct nk_page_element * freelist;
 *     unsigned int count;
 *     unsigned int seq;
 * }</code></pre>
 */
@NativeType("struct nk_context")
public class NkContext extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INPUT,
        STYLE,
        MEMORY,
        CLIP,
        LAST_WIDGET_STATE,
        BUTTON_BEHAVIOR,
        STACKS,
        DELTA_TIME_SECONDS,
        DRAW_LIST,
        USERDATA,
        TEXT_EDIT,
        OVERLAY,
        BUILD,
        USE_POOL,
        POOL,
        BEGIN,
        END,
        ACTIVE,
        CURRENT,
        FREELIST,
        COUNT,
        SEQ;

    static {
        Layout layout = __struct(
            __member(NkInput.SIZEOF, NkInput.ALIGNOF),
            __member(NkStyle.SIZEOF, NkStyle.ALIGNOF),
            __member(NkBuffer.SIZEOF, NkBuffer.ALIGNOF),
            __member(NkClipboard.SIZEOF, NkClipboard.ALIGNOF),
            __member(4),
            __member(4),
            __member(NkConfigurationStacks.SIZEOF, NkConfigurationStacks.ALIGNOF),
            __member(4),
            __member(NkDrawList.SIZEOF, NkDrawList.ALIGNOF),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(NkTextEdit.SIZEOF, NkTextEdit.ALIGNOF),
            __member(NkCommandBuffer.SIZEOF, NkCommandBuffer.ALIGNOF),
            __member(4),
            __member(4),
            __member(NkPool.SIZEOF, NkPool.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INPUT = layout.offsetof(0);
        STYLE = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        CLIP = layout.offsetof(3);
        LAST_WIDGET_STATE = layout.offsetof(4);
        BUTTON_BEHAVIOR = layout.offsetof(5);
        STACKS = layout.offsetof(6);
        DELTA_TIME_SECONDS = layout.offsetof(7);
        DRAW_LIST = layout.offsetof(8);
        USERDATA = layout.offsetof(9);
        TEXT_EDIT = layout.offsetof(10);
        OVERLAY = layout.offsetof(11);
        BUILD = layout.offsetof(12);
        USE_POOL = layout.offsetof(13);
        POOL = layout.offsetof(14);
        BEGIN = layout.offsetof(15);
        END = layout.offsetof(16);
        ACTIVE = layout.offsetof(17);
        CURRENT = layout.offsetof(18);
        FREELIST = layout.offsetof(19);
        COUNT = layout.offsetof(20);
        SEQ = layout.offsetof(21);
    }

    /**
     * Creates a {@code NkContext} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkContext(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkInput} view of the {@code input} field. */
    @NativeType("struct nk_input")
    public NkInput input() { return ninput(address()); }
    /** Returns a {@link NkStyle} view of the {@code style} field. */
    @NativeType("struct nk_style")
    public NkStyle style() { return nstyle(address()); }
    /** Returns a {@link NkBuffer} view of the {@code memory} field. */
    @NativeType("struct nk_buffer")
    public NkBuffer memory() { return nmemory(address()); }
    /** Returns a {@link NkClipboard} view of the {@code clip} field. */
    @NativeType("struct nk_clipboard")
    public NkClipboard clip() { return nclip(address()); }
    /** Returns the value of the {@code last_widget_state} field. */
    @NativeType("nk_flags")
    public int last_widget_state() { return nlast_widget_state(address()); }
    /** Returns the value of the {@code button_behavior} field. */
    @NativeType("enum nk_button_behavior")
    public int button_behavior() { return nbutton_behavior(address()); }
    /** Returns a {@link NkConfigurationStacks} view of the {@code stacks} field. */
    @NativeType("struct nk_configuration_stacks")
    public NkConfigurationStacks stacks() { return nstacks(address()); }
    /** Returns the value of the {@code delta_time_seconds} field. */
    public float delta_time_seconds() { return ndelta_time_seconds(address()); }

    // -----------------------------------

    /** Returns a new {@code NkContext} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkContext malloc() {
        return wrap(NkContext.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkContext} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkContext calloc() {
        return wrap(NkContext.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkContext} instance allocated with {@link BufferUtils}. */
    public static NkContext create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkContext.class, memAddress(container), container);
    }

    /** Returns a new {@code NkContext} instance for the specified memory address. */
    public static NkContext create(long address) {
        return wrap(NkContext.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkContext createSafe(long address) {
        return address == NULL ? null : wrap(NkContext.class, address);
    }

    // -----------------------------------

    /** Returns a new {@code NkContext} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkContext mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkContext} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkContext callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkContext} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkContext mallocStack(MemoryStack stack) {
        return wrap(NkContext.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkContext} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkContext callocStack(MemoryStack stack) {
        return wrap(NkContext.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #input}. */
    public static NkInput ninput(long struct) { return NkInput.create(struct + NkContext.INPUT); }
    /** Unsafe version of {@link #style}. */
    public static NkStyle nstyle(long struct) { return NkStyle.create(struct + NkContext.STYLE); }
    /** Unsafe version of {@link #memory}. */
    public static NkBuffer nmemory(long struct) { return NkBuffer.create(struct + NkContext.MEMORY); }
    /** Unsafe version of {@link #clip}. */
    public static NkClipboard nclip(long struct) { return NkClipboard.create(struct + NkContext.CLIP); }
    /** Unsafe version of {@link #last_widget_state}. */
    public static int nlast_widget_state(long struct) { return UNSAFE.getInt(null, struct + NkContext.LAST_WIDGET_STATE); }
    /** Unsafe version of {@link #button_behavior}. */
    public static int nbutton_behavior(long struct) { return UNSAFE.getInt(null, struct + NkContext.BUTTON_BEHAVIOR); }
    /** Unsafe version of {@link #stacks}. */
    public static NkConfigurationStacks nstacks(long struct) { return NkConfigurationStacks.create(struct + NkContext.STACKS); }
    /** Unsafe version of {@link #delta_time_seconds}. */
    public static float ndelta_time_seconds(long struct) { return UNSAFE.getFloat(null, struct + NkContext.DELTA_TIME_SECONDS); }
    public static NkDrawList ndraw_list(long struct) { return NkDrawList.create(struct + NkContext.DRAW_LIST); }
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkContext.USERDATA); }
    public static NkTextEdit ntext_edit(long struct) { return NkTextEdit.create(struct + NkContext.TEXT_EDIT); }
    public static NkCommandBuffer noverlay(long struct) { return NkCommandBuffer.create(struct + NkContext.OVERLAY); }
    public static int nbuild(long struct) { return UNSAFE.getInt(null, struct + NkContext.BUILD); }
    public static int nuse_pool(long struct) { return UNSAFE.getInt(null, struct + NkContext.USE_POOL); }
    public static NkPool npool(long struct) { return NkPool.create(struct + NkContext.POOL); }
    @Nullable public static NkWindow nbegin(long struct) { return NkWindow.createSafe(memGetAddress(struct + NkContext.BEGIN)); }
    @Nullable public static NkWindow nend(long struct) { return NkWindow.createSafe(memGetAddress(struct + NkContext.END)); }
    @Nullable public static NkWindow nactive(long struct) { return NkWindow.createSafe(memGetAddress(struct + NkContext.ACTIVE)); }
    @Nullable public static NkWindow ncurrent(long struct) { return NkWindow.createSafe(memGetAddress(struct + NkContext.CURRENT)); }
    public static long nfreelist(long struct) { return memGetAddress(struct + NkContext.FREELIST); }
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + NkContext.COUNT); }
    public static int nseq(long struct) { return UNSAFE.getInt(null, struct + NkContext.SEQ); }

}