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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters returned to the callback.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This structure should only be considered valid during the lifetime of the triggered callback.</p>
 * </div>
 * 
 * <p>Since adding queue and command buffer labels behaves like pushing and popping onto a stack, the order of both {@code pQueueLabels} and {@code pCmdBufLabels} is based on the order the labels were defined. The result is that the first label in either {@code pQueueLabels} or {@code pCmdBufLabels} will be the first defined (and therefore the oldest) while the last label in each list will be the most recent.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@code pQueueLabels} will only be non-{@code NULL} if one of the objects in {@code pObjects} can be related directly to a defined {@code VkQueue} which has had one or more labels associated with it.</p>
 * 
 * <p>Likewise, {@code pCmdBufLabels} will only be non-{@code NULL} if one of the objects in {@code pObjects} can be related directly to a defined {@code VkCommandBuffer} which has had one or more labels associated with it. Additionally, while command buffer labels allow for beginning and ending across different command buffers, the debug messaging framework <b>cannot</b> guarantee that labels in {@code pCmdBufLables} will contain those defined outside of the associated command buffer. This is partially due to the fact that the association of one command buffer with another may not have been defined at the time the debug message is triggered.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code pMessageIdName} is not {@code NULL}, {@code pMessageIdName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>{@code pMessage} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>If {@code queueLabelCount} is not 0, {@code pQueueLabels} <b>must</b> be a valid pointer to an array of {@code queueLabelCount} valid {@link VkDebugUtilsLabelEXT} structures</li>
 * <li>If {@code cmdBufLabelCount} is not 0, {@code pCmdBufLabels} <b>must</b> be a valid pointer to an array of {@code cmdBufLabelCount} valid {@link VkDebugUtilsLabelEXT} structures</li>
 * <li>If {@code objectCount} is not 0, {@code pObjects} <b>must</b> be a valid pointer to an array of {@code objectCount} valid {@link VkDebugUtilsObjectNameInfoEXT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsLabelEXT}, {@link VkDebugUtilsObjectNameInfoEXT}, {@link EXTDebugUtils#vkSubmitDebugUtilsMessageEXT SubmitDebugUtilsMessageEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugUtilsMessengerCallbackDataEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDebugUtilsMessengerCallbackDataFlagsEXT {@link #flags};
 *     char const * {@link #pMessageIdName};
 *     int32_t {@link #messageIdNumber};
 *     char const * {@link #pMessage};
 *     uint32_t {@link #queueLabelCount};
 *     {@link VkDebugUtilsLabelEXT VkDebugUtilsLabelEXT} const * {@link #pQueueLabels};
 *     uint32_t {@link #cmdBufLabelCount};
 *     {@link VkDebugUtilsLabelEXT VkDebugUtilsLabelEXT} const * {@link #pCmdBufLabels};
 *     uint32_t {@link #objectCount};
 *     {@link VkDebugUtilsObjectNameInfoEXT VkDebugUtilsObjectNameInfoEXT} const * {@link #pObjects};
 * }</code></pre>
 */
public class VkDebugUtilsMessengerCallbackDataEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PMESSAGEIDNAME,
        MESSAGEIDNUMBER,
        PMESSAGE,
        QUEUELABELCOUNT,
        PQUEUELABELS,
        CMDBUFLABELCOUNT,
        PCMDBUFLABELS,
        OBJECTCOUNT,
        POBJECTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PMESSAGEIDNAME = layout.offsetof(3);
        MESSAGEIDNUMBER = layout.offsetof(4);
        PMESSAGE = layout.offsetof(5);
        QUEUELABELCOUNT = layout.offsetof(6);
        PQUEUELABELS = layout.offsetof(7);
        CMDBUFLABELCOUNT = layout.offsetof(8);
        PCMDBUFLABELS = layout.offsetof(9);
        OBJECTCOUNT = layout.offsetof(10);
        POBJECTS = layout.offsetof(11);
    }

    /**
     * Creates a {@code VkDebugUtilsMessengerCallbackDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsMessengerCallbackDataEXT(ByteBuffer container) {
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
    /** 0 and is reserved for future use. */
    @NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a null-terminated string that identifies the particular message ID that is associated with the provided message. If the message corresponds to a validation layer message, then this string may contain the portion of the Vulkan specification that is believed to have been violated. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pMessageIdName() { return npMessageIdName(address()); }
    /** a null-terminated string that identifies the particular message ID that is associated with the provided message. If the message corresponds to a validation layer message, then this string may contain the portion of the Vulkan specification that is believed to have been violated. */
    @Nullable
    @NativeType("char const *")
    public String pMessageIdNameString() { return npMessageIdNameString(address()); }
    /** the ID number of the triggering message. If the message corresponds to a validation layer message, then this number is related to the internal number associated with the message being triggered. */
    @NativeType("int32_t")
    public int messageIdNumber() { return nmessageIdNumber(address()); }
    /** a null-terminated string detailing the trigger conditions. */
    @NativeType("char const *")
    public ByteBuffer pMessage() { return npMessage(address()); }
    /** a null-terminated string detailing the trigger conditions. */
    @NativeType("char const *")
    public String pMessageString() { return npMessageString(address()); }
    /** a count of items contained in the {@code pQueueLabels} array. */
    @NativeType("uint32_t")
    public int queueLabelCount() { return nqueueLabelCount(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkDebugUtilsLabelEXT} active in the current {@code VkQueue} at the time the callback was triggered. Refer to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-queue-labels">Queue Labels</a> for more information. */
    @Nullable
    @NativeType("VkDebugUtilsLabelEXT const *")
    public VkDebugUtilsLabelEXT.Buffer pQueueLabels() { return npQueueLabels(address()); }
    /** a count of items contained in the {@code pCmdBufLabels} array. */
    @NativeType("uint32_t")
    public int cmdBufLabelCount() { return ncmdBufLabelCount(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkDebugUtilsLabelEXT} active in the current {@code VkCommandBuffer} at the time the callback was triggered. Refer to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-command-buffer-labels">Command Buffer Labels</a> for more information. */
    @Nullable
    @NativeType("VkDebugUtilsLabelEXT const *")
    public VkDebugUtilsLabelEXT.Buffer pCmdBufLabels() { return npCmdBufLabels(address()); }
    /** a count of items contained in the {@code pObjects} array. */
    @NativeType("uint32_t")
    public int objectCount() { return nobjectCount(address()); }
    /** a pointer to an array of {@link VkDebugUtilsObjectNameInfoEXT} objects related to the detected issue. The array is roughly in order or importance, but the 0th element is always guaranteed to be the most important object for this message. */
    @Nullable
    @NativeType("VkDebugUtilsObjectNameInfoEXT const *")
    public VkDebugUtilsObjectNameInfoEXT.Buffer pObjects() { return npObjects(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDebugUtilsMessengerCallbackDataEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@link #sType} field. */
    public VkDebugUtilsMessengerCallbackDataEXT sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDebugUtilsMessengerCallbackDataEXT flags(@NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pMessageIdName} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(@Nullable @NativeType("char const *") ByteBuffer value) { npMessageIdName(address(), value); return this; }
    /** Sets the specified value to the {@link #messageIdNumber} field. */
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(@NativeType("int32_t") int value) { nmessageIdNumber(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pMessage} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pMessage(@NativeType("char const *") ByteBuffer value) { npMessage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@link #pQueueLabels} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(@Nullable @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) { npQueueLabels(address(), value); return this; }
    /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@link #pCmdBufLabels} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(@Nullable @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) { npCmdBufLabels(address(), value); return this; }
    /** Sets the address of the specified {@link VkDebugUtilsObjectNameInfoEXT.Buffer} to the {@link #pObjects} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pObjects(@Nullable @NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT.Buffer value) { npObjects(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsMessengerCallbackDataEXT set(
        int sType,
        long pNext,
        int flags,
        @Nullable ByteBuffer pMessageIdName,
        int messageIdNumber,
        ByteBuffer pMessage,
        @Nullable VkDebugUtilsLabelEXT.Buffer pQueueLabels,
        @Nullable VkDebugUtilsLabelEXT.Buffer pCmdBufLabels,
        @Nullable VkDebugUtilsObjectNameInfoEXT.Buffer pObjects
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pMessageIdName(pMessageIdName);
        messageIdNumber(messageIdNumber);
        pMessage(pMessage);
        pQueueLabels(pQueueLabels);
        pCmdBufLabels(pCmdBufLabels);
        pObjects(pObjects);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugUtilsMessengerCallbackDataEXT set(VkDebugUtilsMessengerCallbackDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCallbackDataEXT malloc() {
        return wrap(VkDebugUtilsMessengerCallbackDataEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCallbackDataEXT calloc() {
        return wrap(VkDebugUtilsMessengerCallbackDataEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsMessengerCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugUtilsMessengerCallbackDataEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance for the specified memory address. */
    public static VkDebugUtilsMessengerCallbackDataEXT create(long address) {
        return wrap(VkDebugUtilsMessengerCallbackDataEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsMessengerCallbackDataEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugUtilsMessengerCallbackDataEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCallbackDataEXT malloc(MemoryStack stack) {
        return wrap(VkDebugUtilsMessengerCallbackDataEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCallbackDataEXT calloc(MemoryStack stack) {
        return wrap(VkDebugUtilsMessengerCallbackDataEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.FLAGS); }
    /** Unsafe version of {@link #pMessageIdName}. */
    @Nullable public static ByteBuffer npMessageIdName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME)); }
    /** Unsafe version of {@link #pMessageIdNameString}. */
    @Nullable public static String npMessageIdNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME)); }
    /** Unsafe version of {@link #messageIdNumber}. */
    public static int nmessageIdNumber(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.MESSAGEIDNUMBER); }
    /** Unsafe version of {@link #pMessage}. */
    public static ByteBuffer npMessage(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE)); }
    /** Unsafe version of {@link #pMessageString}. */
    public static String npMessageString(long struct) { return memUTF8(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE)); }
    /** Unsafe version of {@link #queueLabelCount}. */
    public static int nqueueLabelCount(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.QUEUELABELCOUNT); }
    /** Unsafe version of {@link #pQueueLabels}. */
    @Nullable public static VkDebugUtilsLabelEXT.Buffer npQueueLabels(long struct) { return VkDebugUtilsLabelEXT.createSafe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS), nqueueLabelCount(struct)); }
    /** Unsafe version of {@link #cmdBufLabelCount}. */
    public static int ncmdBufLabelCount(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.CMDBUFLABELCOUNT); }
    /** Unsafe version of {@link #pCmdBufLabels}. */
    @Nullable public static VkDebugUtilsLabelEXT.Buffer npCmdBufLabels(long struct) { return VkDebugUtilsLabelEXT.createSafe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS), ncmdBufLabelCount(struct)); }
    /** Unsafe version of {@link #objectCount}. */
    public static int nobjectCount(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT); }
    /** Unsafe version of {@link #pObjects}. */
    @Nullable public static VkDebugUtilsObjectNameInfoEXT.Buffer npObjects(long struct) { return VkDebugUtilsObjectNameInfoEXT.createSafe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.POBJECTS), nobjectCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.FLAGS, value); }
    /** Unsafe version of {@link #pMessageIdName(ByteBuffer) pMessageIdName}. */
    public static void npMessageIdName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #messageIdNumber(int) messageIdNumber}. */
    public static void nmessageIdNumber(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.MESSAGEIDNUMBER, value); }
    /** Unsafe version of {@link #pMessage(ByteBuffer) pMessage}. */
    public static void npMessage(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE, memAddress(value));
    }
    /** Sets the specified value to the {@code queueLabelCount} field of the specified {@code struct}. */
    public static void nqueueLabelCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.QUEUELABELCOUNT, value); }
    /** Unsafe version of {@link #pQueueLabels(VkDebugUtilsLabelEXT.Buffer) pQueueLabels}. */
    public static void npQueueLabels(long struct, @Nullable VkDebugUtilsLabelEXT.Buffer value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS, memAddressSafe(value)); nqueueLabelCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code cmdBufLabelCount} field of the specified {@code struct}. */
    public static void ncmdBufLabelCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.CMDBUFLABELCOUNT, value); }
    /** Unsafe version of {@link #pCmdBufLabels(VkDebugUtilsLabelEXT.Buffer) pCmdBufLabels}. */
    public static void npCmdBufLabels(long struct, @Nullable VkDebugUtilsLabelEXT.Buffer value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS, memAddressSafe(value)); ncmdBufLabelCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code objectCount} field of the specified {@code struct}. */
    public static void nobjectCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT, value); }
    /** Unsafe version of {@link #pObjects(VkDebugUtilsObjectNameInfoEXT.Buffer) pObjects}. */
    public static void npObjects(long struct, @Nullable VkDebugUtilsObjectNameInfoEXT.Buffer value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.POBJECTS, memAddressSafe(value)); nobjectCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE));
        int queueLabelCount = nqueueLabelCount(struct);
        if (queueLabelCount != 0) {
            long pQueueLabels = memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS);
            check(pQueueLabels);
            validate(pQueueLabels, queueLabelCount, VkDebugUtilsLabelEXT.SIZEOF, VkDebugUtilsLabelEXT::validate);
        }
        int cmdBufLabelCount = ncmdBufLabelCount(struct);
        if (cmdBufLabelCount != 0) {
            long pCmdBufLabels = memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS);
            check(pCmdBufLabels);
            validate(pCmdBufLabels, cmdBufLabelCount, VkDebugUtilsLabelEXT.SIZEOF, VkDebugUtilsLabelEXT::validate);
        }
        if (nobjectCount(struct) != 0) {
            check(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.POBJECTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDebugUtilsMessengerCallbackDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsMessengerCallbackDataEXT, Buffer> implements NativeResource {

        private static final VkDebugUtilsMessengerCallbackDataEXT ELEMENT_FACTORY = VkDebugUtilsMessengerCallbackDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsMessengerCallbackDataEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugUtilsMessengerCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugUtilsMessengerCallbackDataEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsMessengerCallbackDataEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCallbackDataEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsMessengerCallbackDataEXT.npNext(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCallbackDataEXT#flags} field. */
        @NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
        public int flags() { return VkDebugUtilsMessengerCallbackDataEXT.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkDebugUtilsMessengerCallbackDataEXT#pMessageIdName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pMessageIdName() { return VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkDebugUtilsMessengerCallbackDataEXT#pMessageIdName} field. */
        @Nullable
        @NativeType("char const *")
        public String pMessageIdNameString() { return VkDebugUtilsMessengerCallbackDataEXT.npMessageIdNameString(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCallbackDataEXT#messageIdNumber} field. */
        @NativeType("int32_t")
        public int messageIdNumber() { return VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkDebugUtilsMessengerCallbackDataEXT#pMessage} field. */
        @NativeType("char const *")
        public ByteBuffer pMessage() { return VkDebugUtilsMessengerCallbackDataEXT.npMessage(address()); }
        /** @return the null-terminated string pointed to by the {@link VkDebugUtilsMessengerCallbackDataEXT#pMessage} field. */
        @NativeType("char const *")
        public String pMessageString() { return VkDebugUtilsMessengerCallbackDataEXT.npMessageString(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCallbackDataEXT#queueLabelCount} field. */
        @NativeType("uint32_t")
        public int queueLabelCount() { return VkDebugUtilsMessengerCallbackDataEXT.nqueueLabelCount(address()); }
        /** @return a {@link VkDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@link VkDebugUtilsMessengerCallbackDataEXT#pQueueLabels} field. */
        @Nullable
        @NativeType("VkDebugUtilsLabelEXT const *")
        public VkDebugUtilsLabelEXT.Buffer pQueueLabels() { return VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCallbackDataEXT#cmdBufLabelCount} field. */
        @NativeType("uint32_t")
        public int cmdBufLabelCount() { return VkDebugUtilsMessengerCallbackDataEXT.ncmdBufLabelCount(address()); }
        /** @return a {@link VkDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@link VkDebugUtilsMessengerCallbackDataEXT#pCmdBufLabels} field. */
        @Nullable
        @NativeType("VkDebugUtilsLabelEXT const *")
        public VkDebugUtilsLabelEXT.Buffer pCmdBufLabels() { return VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(address()); }
        /** @return the value of the {@link VkDebugUtilsMessengerCallbackDataEXT#objectCount} field. */
        @NativeType("uint32_t")
        public int objectCount() { return VkDebugUtilsMessengerCallbackDataEXT.nobjectCount(address()); }
        /** @return a {@link VkDebugUtilsObjectNameInfoEXT.Buffer} view of the struct array pointed to by the {@link VkDebugUtilsMessengerCallbackDataEXT#pObjects} field. */
        @Nullable
        @NativeType("VkDebugUtilsObjectNameInfoEXT const *")
        public VkDebugUtilsObjectNameInfoEXT.Buffer pObjects() { return VkDebugUtilsMessengerCallbackDataEXT.npObjects(address()); }

        /** Sets the specified value to the {@link VkDebugUtilsMessengerCallbackDataEXT#sType} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsMessengerCallbackDataEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@link VkDebugUtilsMessengerCallbackDataEXT#sType} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCallbackDataEXT#pNext} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsMessengerCallbackDataEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCallbackDataEXT#flags} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer flags(@NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { VkDebugUtilsMessengerCallbackDataEXT.nflags(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkDebugUtilsMessengerCallbackDataEXT#pMessageIdName} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pMessageIdName(@Nullable @NativeType("char const *") ByteBuffer value) { VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsMessengerCallbackDataEXT#messageIdNumber} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer messageIdNumber(@NativeType("int32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkDebugUtilsMessengerCallbackDataEXT#pMessage} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pMessage(@NativeType("char const *") ByteBuffer value) { VkDebugUtilsMessengerCallbackDataEXT.npMessage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@link VkDebugUtilsMessengerCallbackDataEXT#pQueueLabels} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pQueueLabels(@Nullable @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) { VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(address(), value); return this; }
        /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@link VkDebugUtilsMessengerCallbackDataEXT#pCmdBufLabels} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pCmdBufLabels(@Nullable @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) { VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(address(), value); return this; }
        /** Sets the address of the specified {@link VkDebugUtilsObjectNameInfoEXT.Buffer} to the {@link VkDebugUtilsMessengerCallbackDataEXT#pObjects} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pObjects(@Nullable @NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT.Buffer value) { VkDebugUtilsMessengerCallbackDataEXT.npObjects(address(), value); return this; }

    }

}