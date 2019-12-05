public class codeHour {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int codeHours;
        codeHours = 6;

        int workDays;
        workDays = 5;

        int semester;
        semester = 17;

        int totalCodingHours;
        totalCodingHours = semester * workDays * codeHours;

        int averageWorkingHoursPerWeek;
        averageWorkingHoursPerWeek = 52;

        int totalWorkingHoursPerSemester;
        totalWorkingHoursPerSemester = semester * averageWorkingHoursPerWeek;

        double averageCodingHoursPerSemester;
        averageCodingHoursPerSemester = (float) totalCodingHours / (float) totalWorkingHoursPerSemester;

        System.out.println("total hours spent with coding in a semester: " + totalCodingHours);
        System.out.println("total working hours per semester: " + totalWorkingHoursPerSemester);
        System.out.println("percentage of coding hours in a semester by average 52 work hours weekly: " + averageCodingHoursPerSemester);

    }
}
