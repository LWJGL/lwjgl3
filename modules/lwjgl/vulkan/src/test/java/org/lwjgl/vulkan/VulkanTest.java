/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.testng.Assert.*;

@Test
public class VulkanTest {

    public void testParse() {
        try (MemoryStack stack = stackPush()) {
            VkAccelerationStructureInstanceKHR struct = VkAccelerationStructureInstanceKHR.calloc(stack);

            // first bitfield
            assertEquals(VkAccelerationStructureInstanceKHR.nbitfield0(struct.address()), 0);

            assertEquals(struct.instanceCustomIndex(), 0);
            assertEquals(struct.mask(), 0);

            struct.instanceCustomIndex(0x99FFFFFF); // test masking
            assertEquals(struct.instanceCustomIndex(), 0xFFFFFF);
            assertEquals(struct.mask(), 0);

            struct.mask(0x999999FF); // test masking
            assertEquals(struct.instanceCustomIndex(), 0xFFFFFF);
            assertEquals(struct.mask(), 0xFF);

            // second bitfield
            assertEquals(VkAccelerationStructureInstanceKHR.nbitfield1(struct.address()), 0);

            assertEquals(struct.instanceShaderBindingTableRecordOffset(), 0);
            assertEquals(struct.flags(), 0);

            struct.instanceShaderBindingTableRecordOffset(0x99FFFFFF); // test masking
            assertEquals(struct.instanceShaderBindingTableRecordOffset(), 0xFFFFFF);
            assertEquals(struct.flags(), 0);

            struct.flags(0x999999FF); // test masking
            assertEquals(struct.instanceShaderBindingTableRecordOffset(), 0xFFFFFF);
            assertEquals(struct.flags(), 0xFF);
        }
    }

}
