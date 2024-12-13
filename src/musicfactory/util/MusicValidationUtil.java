package musicfactory.util;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class MusicValidationUtil {
    private static final Pattern SONG_ID_PATTERN = Pattern.compile("^\\d+$"); // Song ID: numeric
    private static final Pattern SONG_TITLE_PATTERN = Pattern.compile("^[a-zA-Z0-9\\s]{1,50}$"); // Song Title: alphanumeric, max 50 chars
    private static final Pattern ARTIST_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]{1,50}$"); // Artist Name: alphabetic, max 50 chars
    private static final String[] VALID_GENRES = {"POP", "ROCK", "JAZZ", "CLASSICAL", "HIPHOP", "COUNTRY", "ELECTRONIC"};
    private static final Pattern VIEWS_PATTERN = Pattern.compile("^\\d+$"); // Views: numeric

    // Validate if a string is null or empty
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    // Validate song ID
    public static boolean isValidSongId(String songId) {
        return !isNullOrEmpty(songId) && SONG_ID_PATTERN.matcher(songId).matches();
    }

    // Validate song title
    public static boolean isValidSongTitle(String title) {
        return !isNullOrEmpty(title) && SONG_TITLE_PATTERN.matcher(title).matches();
    }

    // Validate artist name
    public static boolean isValidArtistName(String artistName) {
        return !isNullOrEmpty(artistName) && ARTIST_NAME_PATTERN.matcher(artistName).matches();
    }

    // Validate genre
    public static boolean isValidGenre(String genre) {
    if (isNullOrEmpty(genre)) {
        return false;
    }

    // Compare the input genre (uppercase) with the valid genres
    for (String validGenre : VALID_GENRES) {
        if (validGenre.equalsIgnoreCase(genre.trim())) {
            return true;
        }
    }
    return false; // Return false if the genre is not in the valid list
}

    // Validate views
    public static boolean isValidViews(String views) {
        return !isNullOrEmpty(views) && VIEWS_PATTERN.matcher(views).matches();
    }

    // Validate release date (cannot be in the future)
    public static boolean isValidReleaseDate(String releaseDateStr) {
        if (isNullOrEmpty(releaseDateStr)) {
            return false; // Empty or null date is invalid
        }

        try {
            LocalDate releaseDate = LocalDate.parse(releaseDateStr); // Parse to LocalDate
            return !releaseDate.isAfter(LocalDate.now()); // Ensure the date is not in the future
        } catch (Exception e) {
            return false; // Invalid date format
        }
    }

    // Validate all song details
    public static boolean isValidSong(String songId, String title, String artist, String genre, String views, String releaseDate) {
        return isValidSongId(songId) 
                && isValidSongTitle(title) 
                && isValidArtistName(artist) 
                && isValidGenre(genre) 
                && isValidViews(views) 
                && isValidReleaseDate(releaseDate);
    }
}
