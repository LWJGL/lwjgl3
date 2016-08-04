/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator.util.vulkan;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ValidityGenerator {

	private static final Pattern VALID_USAGE_PATTERN = Pattern.compile(
		"ifdef::doctype-manpage\\[]\\nValid Usage\\n" +
			"-----------\\n" +
			"endif::doctype-manpage\\[]\\n" +
			"((?:.(?!\\nifndef::doctype-manpage\\[]))+.)",
		Pattern.DOTALL
	);

		private static final Pattern HOST_SYNC_PATTERN = Pattern.compile(
		"ifdef::doctype-manpage\\[]\\nHost Synchronization\\n" +
			"--------------------\\n" +
			"endif::doctype-manpage\\[]\\n" +
			"((?:.(?!\\nifndef::doctype-manpage\\[]))+.)",
		Pattern.DOTALL
	);


	private ValidityGenerator() {
	}

	public static void main(String[] args) {
		if ( args.length == 0 )
			throw new IllegalArgumentException("Please specify the Vulkan-Docs directory.");

		File docs = new File(args[0], "doc/specs/vulkan/validity");
		if ( !docs.isDirectory() )
			throw new IllegalArgumentException("The specified path is not the Vulkan-Docs root directory: " + args[0]);

		process(docs, "Protos", "vk");
		process(docs, "Structs", "Vk");
	}

	private static void process(File inputRoot, String type, String prefix) {
		File inputPath = new File(inputRoot, type.toLowerCase());
		if ( !inputPath.isDirectory() )
			throw new IllegalStateException("Input path contains unrecognized files.");

		File[] inputFiles = inputPath.listFiles(pathname -> pathname.isFile() && pathname.getName().startsWith(prefix) && pathname.getName().endsWith(".txt"));

		if ( inputFiles.length == 0 )
			throw new IllegalStateException("No input files found.");

		File outputFile = new File("modules/templates/src/main/kotlin/org/lwjgl/vulkan/Validity" + type + ".kt");

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"));

			bw.write("/*\n" +
				         " * Copyright LWJGL. All rights reserved.\n" +
				         " * License terms: https://www.lwjgl.org/license\n" +
				         " * MACHINE GENERATED FILE, DO NOT EDIT\n" +
				         " */\n");
			bw.write("package org.lwjgl.vulkan\n\n");

			bw.write("import org.lwjgl.generator.*\n\n");

			bw.write("object Validity" + type + " {\n\n");

			boolean first = true;
			for ( File inputFile : inputFiles ) {
				String input;
				try {
					input = new Scanner(inputFile, "UTF-8").useDelimiter("\\Z").next();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}

				Matcher um = VALID_USAGE_PATTERN.matcher(input);
				if ( !um.find() ) {
					System.out.println("Failed to find \"Valid Usage\" block in: " + inputPath.getName() + File.separator + inputFile.getName());
					continue;
				}

				if ( !first )
					bw.write("\n\n");


				bw.write("val " + inputFile.getName().substring(0, inputFile.getName().length() - 4) + " =\n");
				bw.write("\t\"\"\"");

				bw.write(VulkanFormatter.formatValidation(um.group(1), ""));
				Matcher sm = HOST_SYNC_PATTERN.matcher(input);
				if ( sm.find(um.end()) ) {
					bw.write("\n\n");
					bw.write(VulkanFormatter.formatValidation(sm.group(1), "\t\t", "Host Synchronization"));
				}

				bw.write("\"\"\"");

				first = false;
			}

			bw.write("\n\n}");

			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ( bw != null )
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}