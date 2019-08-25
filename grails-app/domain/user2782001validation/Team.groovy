package user2782001validation

class Team {
    String name
    static constraints = {
        name matches: /[A-Z].*/
    }
}
