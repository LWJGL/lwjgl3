/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator.util;

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public final class URLValidator {

    private static final Pattern LINK = Pattern.compile("href=\"([^\"]+)\"");

    private static final Set<URL> LINKS = new HashSet<>();

    private URLValidator() {}

    public static void main(String[] args) throws IOException {
        HttpURLConnection.setFollowRedirects(false);

        if (0 < args.length) {
            parseDirectory(Paths.get("modules/lwjgl", args[0], "src/generated/java/org/lwjgl"));
        } else {
            try (Stream<Path> modules = Files.list(Paths.get("modules/lwjgl"))) {
                modules
                    .filter(it -> Files.isDirectory(it))
                    .forEach(it -> parseDirectory(it.resolve("src/generated/java/org/lwjgl")));
            }
        }

        System.out.println("Found " + LINKS.size() + " links.");
        System.out.println("Testing...");
        System.out.println();

        LINKS
            .parallelStream()
            .forEach(URLValidator::checkURL);
    }

    public static void checkURL(URL url) {
        String[] location = new String[1];

        int status = checkURL(url, "HEAD", location);
        if (status == HttpURLConnection.HTTP_FORBIDDEN) {
            status = checkURL(url, "GET", location);
        }

        if (status == HttpURLConnection.HTTP_OK) {
            return;
        }

        if (!url.toString().startsWith("http://docs.gl")) {
            System.err.println(status == HttpURLConnection.HTTP_MOVED_PERM
                ? "301: " + url + "\n  -> " + location[0]
                : status + ": " + url
            );
        }
    }

    public static int checkURL(URL url, String method, String[] location) {
        try {
            HttpURLConnection cnx = (HttpURLConnection)url.openConnection();

            cnx.setRequestProperty(
                "User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36"
            );
            cnx.setRequestMethod(method);

            try {
                return cnx.getResponseCode();
            } finally {
                location[0] = cnx.getHeaderField("Location");
                cnx.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static void parseDirectory(Path path) {
        try (Stream<Path> files = Files.list(path)) {
            files
                .forEach((it) -> {
                    try {
                        if (Files.isDirectory(it)) {
                            parseDirectory(it);
                        } else if (Files.isRegularFile(it)) {
                            parseFile(it);
                        } else {
                            System.err.println("Invalid file: " + it);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void parseFile(Path path) throws IOException {
        String source = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        Matcher matcher = LINK.matcher(source);
        while (matcher.find()) {
            try {
                LINKS.add(new URL(matcher.group(1)));
            } catch (MalformedURLException e) {
                System.err.println("Malformed URL: " + matcher.group(1) + " (" + path + ")");
            }
        }

    }

}