export interface Notifier {
    log(message: string): void;

    loggedMessages(): string[];
}